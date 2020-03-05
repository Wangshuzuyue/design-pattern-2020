package com.hzw.decorator;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:08
 * @description:
 */
public class AssignmentMenu implements Menu{
    @Override
    public String getName() {
        return "作业";
    }

    @Override
    public int getPriority() {
        return 210;
    }
}
