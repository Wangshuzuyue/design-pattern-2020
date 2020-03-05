package com.hzw.decorator;

import java.util.TreeSet;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:25
 * @description: 成长墙菜单路由
 */
public class GrowWallMenuRoute implements MenuRoute {

    private MenuRoute menuRoute;

    public GrowWallMenuRoute(MenuRoute menuRoute) {
        this.menuRoute = menuRoute;
        this.menuRoute.getMenus().add(new GrowWallMenu());
    }

    @Override
    public TreeSet<Menu> getMenus() {
        return menuRoute.getMenus();
    }
}
