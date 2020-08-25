package com.hzw.visitor.kpi;

import java.util.Random;

/**
 * @author: huangzuwang
 * @date: 2020-03-24 13:48
 * @description: 开发工程师
 */
public class Developer extends Employee{

    public Developer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        //关键步骤步骤，不同实现类调用了访问者不同的方法
        visitor.visit(this);
    }

    /**
     * 写了多少行代码
     * @return
     */
    public int getCodeLine(){
        return new Random().nextInt(100000);
    }
}
