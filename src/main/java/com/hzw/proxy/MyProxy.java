package com.hzw.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: huangzuwang
 * @date: 2020-03-02 16:48
 **/
public class MyProxy {

    /**
     * 换行符
     */
    public static final String ln = "\r\n";

    /**
     * 获取代理类实例
     * @return
     */
    public static Object newProxyInstance(MyClassLoader classLoader,
                                          Class<?> [] interfaces, MyInvocationHandler h){

        try {
            //1.生成代理类Java代码, 并输出到磁盘的MyProxy.class文件同目录
            String generateSrc = generateSrc(interfaces);
            String filePath = MyProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(generateSrc);
            fw.flush();
            fw.close();

            //2.编译代理类
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manage.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
            task.call();
            manage.close();

            //3.加载代理类class文件到jvm
            Class proxyClass =  classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
            //删除代理类java文件
            f.delete();

            //4.实例化代理类对象，返回（返回字节码重组以后的新的代理对象）
            return c.newInstance(h);

        }catch (Throwable e){
            throw new RuntimeException(">>>>>>出错啦！！！！！", e);
        }
    }


    private static String generateSrc(Class<?> [] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package com.hzw.proxy;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements ");

        for (int i = 0; i < interfaces.length; i++){
            if (i == interfaces.length - 1){
                sb.append(interfaces[i].getName());
            }else {
                sb.append(interfaces[i].getName() + ",");
            }
        }
        sb.append("{" + ln);

        //成员变量
        sb.append("MyInvocationHandler h;" + ln);

        //构造函数, 带InvocationHandler参数
        sb.append("public $Proxy0(MyInvocationHandler h) { " + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);

        //每个接口
        for (Class interfaceClazz : interfaces){
            //接口下每个方法
            for (Method m : interfaceClazz.getMethods()){
                //方法的参数类型数组
                Class<?>[] params = m.getParameterTypes();
                //所有入参名字符串
                StringBuffer paramNames = new StringBuffer();
                //参数值
                StringBuffer paramValues = new StringBuffer();
                //参数类型
                StringBuffer paramClasses = new StringBuffer();

                for (int i = 0; i < params.length; i++) {
                    Class clazz = params[i];
                    //全类名
                    String type = clazz.getName();
                    //参数名
                    String paramName = "arg" + i;

                    paramNames.append(type + " " +  paramName);
                    paramValues.append(paramName);
                    paramClasses.append(clazz.getName() + ".class");
                    if(i > 0 && i < params.length-1){
                        paramNames.append(",");
                        paramClasses.append(",");
                        paramValues.append(",");
                    }
                }

                sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {" + ln);
                sb.append("try{" + ln);
                sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + ln);

                sb.append((hasReturnValue(m.getReturnType()) ? "return " : "")
                        + getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",m.getReturnType()) + ";" + ln);

                sb.append("}catch(Error _ex) { }");
                sb.append("catch(Throwable e){" + ln);
                sb.append("throw new UndeclaredThrowableException(e);" + ln);
                sb.append("}");
                sb.append(getReturnEmptyCode(m.getReturnType()));
                sb.append("}");
            }
        }
        sb.append("}" + ln);
        return sb.toString();
    }



    private static Map<Class,Class> mappings = new HashMap<>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }

    /**
     * 强转返回值类型
     * @param code
     * @param returnClass
     * @return
     */
    private static String getCaseCode(String code, Class<?> returnClass){
        //基本类型
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }else{
            //非基本类型
            return "("+ returnClass +")" + code;
        }
    }

    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }
}
