package com.hzw.visitor.kpi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-03-24 14:04
 * @description: 业务报表【不容易变的结构】
 */
public class BusinessReport {

    private List<Employee> employeeList = new ArrayList<>();

    public BusinessReport() {
        employeeList.add(new Developer("开发A"));
        employeeList.add(new Developer("开发B"));
        employeeList.add(new ProductManager("产品经理A"));
        employeeList.add(new ProductManager("产品经理B"));
    }

    public void showReport(Visitor visitor){
        for (Employee employee : employeeList){
            employee.accept(visitor);
        }
    }
}
