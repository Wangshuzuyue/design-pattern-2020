package com.hzw.decorator;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:08
 * @description:
 */
public class CourseMenu implements Menu{
    @Override
    public String getName() {
        return "精品课";
    }

    @Override
    public int getPriority() {
        return 300;
    }
}
