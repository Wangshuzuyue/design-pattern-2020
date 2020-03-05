package com.hzw.decorator;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:07
 * @description:
 */
public interface Menu {

    /**
     * 菜单名称
     * @return
     */
    String getName();

    /**
     * 排序优先级
     * @return
     */
    int getPriority();
}
