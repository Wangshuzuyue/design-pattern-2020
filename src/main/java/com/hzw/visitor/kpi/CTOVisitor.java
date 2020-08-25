package com.hzw.visitor.kpi;

/**
 * @author: huangzuwang
 * @date: 2020-03-24 13:59
 * @description: CTO访问者
 */

public class CTOVisitor implements Visitor{
    @Override
    public void visit(Developer developer) {
        System.out.println(String.format("工程师 %s 代码行数: %s", developer.getName(),
                developer.getCodeLine()));
    }

    @Override
    public void visit(ProductManager productManager) {
        System.out.println(String.format("产品经理 %s 产品数量: %s", productManager.getName(),
                productManager.getProductCount()));
    }
}
