package com.hzw.proxy;

/**
 * @description:
 * @author: huangzuwang
 * @date: 2020-03-02 16:49
 **/
public class ZhangJie implements Singer{
    @Override
    public int sing(String songName) {
        System.out.println("张杰演唱:" + songName);
        return 666;
    }
}
