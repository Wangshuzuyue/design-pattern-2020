package com.hzw.visitor.kpi;

/**
 * @author: huangzuwang
 * @date: 2020-03-24 13:46
 * @description: 访问者 接口
 */
public interface Visitor {

    /**
     * 访问 开发者 员工
     * @param developer
     */
    void visit(Developer developer);

    /**
     * 访问 项目经理 员工
     * @param productManager
     */
    void visit(ProductManager productManager);

}
