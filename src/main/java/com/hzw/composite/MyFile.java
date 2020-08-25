package com.hzw.composite;

/**
 * @author: huangzuwang
 * @date: 2020-03-09 17:25
 * @description:
 */
public class MyFile extends MyDirectory{

    /**
     * 文件大小
     */
    private long size;

    public MyFile(String name) {
        super(name);
    }

    public MyFile(String name, long size) {
        super(name);
        this.size = size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getSize(){
        return this.size;
    }

    @Override
    public void show() {
        System.out.println("文件:" + getName() + " 大小:" + size);
    }
}
