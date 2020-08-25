package com.hzw.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-03-09 17:25
 * @description:
 */
public class MyFolder extends MyDirectory{

    private int level;

    private List<MyDirectory> children = new ArrayList<>();

    public MyFolder(String name, int level) {
        super(name);
        this.level = level;
    }

    public List<MyDirectory> getChildren() {
        return children;
    }

    public void setChildren(List<MyDirectory> children) {
        this.children = children;
    }

    @Override
    public void show() {
        System.out.print("文件夹:" + getName());
        System.out.println();
        for (MyDirectory child : children){
            for (int i = 0; i < level; i++){
                System.out.print("  ");
            }
            child.show();
        }

    }
}
