package com.hzw.proxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: huangzuwang
 * @date: 2020-03-02 16:48
 **/
public interface MyInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
