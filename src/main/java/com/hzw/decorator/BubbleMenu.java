package com.hzw.decorator;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:08
 * @description:
 */
public class BubbleMenu implements Menu{
    @Override
    public String getName() {
        return "冒泡";
    }

    @Override
    public int getPriority() {
        return 400;
    }
}
