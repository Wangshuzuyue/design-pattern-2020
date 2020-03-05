package com.hzw.decorator;

import java.util.TreeSet;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:25
 * @description: 作业菜单路由
 */
public class AssignmentMenuRoute implements MenuRoute {

    private MenuRoute menuRoute;

    public AssignmentMenuRoute(MenuRoute menuRoute) {
        this.menuRoute = menuRoute;
        this.menuRoute.getMenus().add(new AssignmentMenu());
    }

    @Override
    public TreeSet<Menu> getMenus() {
        return menuRoute.getMenus();
    }
}
