package com.hzw;


import com.hzw.proxy.Singer;
import com.hzw.proxy.SingerBroker;
import com.hzw.proxy.ZhangJie;

/**
 * @description:
 * @author: huangzuwang
 * @date: 2020-03-02 16:51
 **/
public class ProxyTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Singer singer = (Singer) new SingerBroker().getProxyInstance(ZhangJie.class);
        int result = singer.sing("明天过后");
        System.out.println("打Call！" + result);
    }
}
