package com.hzw.decorator;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:08
 * @description:
 */
public class GrowWallMenu implements Menu{

    @Override
    public String getName() {
        return "成长墙";
    }

    @Override
    public int getPriority() {
        return 230;
    }
}
