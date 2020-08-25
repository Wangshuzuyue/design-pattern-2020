package com.hzw.visitor.kpi;

/**
 * @author: huangzuwang
 * @date: 2020-03-24 13:59
 * @description: CEO访问者
 */

public class CEOVisitor implements Visitor{
    @Override
    public void visit(Developer developer) {
        System.out.println(String.format("CEO访问者 --> 工程师 %s KPI: %s", developer.getName(),
                developer.getKpi()));
    }

    @Override
    public void visit(ProductManager productManager) {
        System.out.println(String.format("CEO访问者 --> 产品经理 %s KPI: %s", productManager.getName(),
                productManager.getKpi()));
    }
}
