package com.hzw.decorator;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:08
 * @description:
 */
public class StoreMenu implements Menu{
    @Override
    public String getName() {
        return "商城";
    }

    @Override
    public int getPriority() {
        return 500;
    }
}
