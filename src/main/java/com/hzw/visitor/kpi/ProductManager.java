package com.hzw.visitor.kpi;

import java.util.Random;

/**
 * @author: huangzuwang
 * @date: 2020-03-24 13:48
 * @description: 项目经理
 */
public class ProductManager extends Employee{

    public ProductManager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        //关键步骤步骤，不同实现类调用了访问者不同的方法
        visitor.visit(this);
    }

    /**
     * 每年新产品研发数量
     * @return
     */
    public int getProductCount(){
        return new Random().nextInt(10);
    }
}
