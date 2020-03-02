package com.hzw.proxy;

import java.lang.reflect.Method;

/**
 * @description: 歌手经纪人
 * @author: huangzuwang
 * @date: 2020-03-02 16:49
 **/
public class SingerBroker implements MyInvocationHandler{

    Object target;
    public Object getProxyInstance(Class<?> clazz) throws IllegalAccessException, InstantiationException {
        this.target = clazz.newInstance();
        Object o = MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
        return o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("卖门票");
        Object result = method.invoke(this.target, args);
        System.out.println("安排签名会");
        return result;
    }
}
