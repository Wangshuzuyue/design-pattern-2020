package com.hzw.visitor.kpi;

import java.util.Random;

/**
 * @author: huangzuwang
 * @date: 2020-03-24 13:43
 * @description: 员工 抽象类
 */
public abstract class Employee {

    private String name;

    private int kpi;

    public Employee(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }

    //接收访问者
    public abstract void accept(Visitor visitor);
}
