package com.hzw.composite;

/**
 * @author: huangzuwang
 * @date: 2020-03-09 17:24
 * @description: 目录
 */
public abstract class MyDirectory {

    private String name;

    /**
     * 获取全路径名
     * @return
     */
    public String getName(){
        return this.name;
    }

    public MyDirectory(String name) {
        this.name = name;
    }

    /**
     * 打印目录
     */
    public abstract void show();
}
