package com.hzw;


import com.hzw.visitor.kpi.BusinessReport;
import com.hzw.visitor.kpi.CEOVisitor;
import com.hzw.visitor.kpi.CTOVisitor;
import com.hzw.visitor.kpi.Visitor;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 12:02
 * @description:
 */
public class VisitorTest {

    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();
        Visitor ctoVisitor = new CTOVisitor();
        Visitor ceoVisitor = new CEOVisitor();

        System.out.println("-------CTO看业绩报表-------");
        businessReport.showReport(ctoVisitor);

        System.out.println("-------CEO看KPI报表-------");
        businessReport.showReport(ceoVisitor);
    }
}
