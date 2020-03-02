package com.hzw.proxy;
import java.lang.reflect.*;
public class $Proxy0 implements com.hzw.proxy.Singer{
MyInvocationHandler h;
public $Proxy0(MyInvocationHandler h) { 
this.h = h;}
public int sing(java.lang.String arg0) {
try{
Method m = com.hzw.proxy.Singer.class.getMethod("sing",new Class[]{java.lang.String.class});
return ((java.lang.Integer)this.h.invoke(this,m,new Object[]{arg0})).intValue();
}catch(Error _ex) { }catch(Throwable e){
throw new UndeclaredThrowableException(e);
}return 0;}}
