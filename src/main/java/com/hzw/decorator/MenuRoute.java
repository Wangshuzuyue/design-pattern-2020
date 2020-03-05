package com.hzw.decorator;

import java.util.TreeSet;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:01
 * @description: 菜单路由接口定义
 */
public interface MenuRoute {

    /**
     * 获取菜单集合
     * @return
     */
    TreeSet<Menu> getMenus();
}
