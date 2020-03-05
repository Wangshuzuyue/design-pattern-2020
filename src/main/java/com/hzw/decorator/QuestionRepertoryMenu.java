package com.hzw.decorator;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:08
 * @description:
 */
public class QuestionRepertoryMenu implements Menu{
    @Override
    public String getName() {
        return "题库";
    }

    @Override
    public int getPriority() {
        return 220;
    }
}
