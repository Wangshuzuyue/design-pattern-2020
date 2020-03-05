package com.hzw.decorator;

import java.util.TreeSet;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:25
 * @description: 题库菜单路由
 */
public class QuestionRepertoryMenuRoute implements MenuRoute {

    private MenuRoute menuRoute;

    public QuestionRepertoryMenuRoute(MenuRoute menuRoute) {
        this.menuRoute = menuRoute;
        this.menuRoute.getMenus().add(new QuestionRepertoryMenu());
    }

    @Override
    public TreeSet<Menu> getMenus() {
        return menuRoute.getMenus();
    }
}
