package com.hzw.decorator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:01
 * @description: 基本菜单路由
 */
public class BaseMenuRoute implements MenuRoute{

    TreeSet<Menu> menuSet = new TreeSet<>(Comparator.comparing(Menu::getPriority));

    @Override
    public TreeSet<Menu> getMenus() {
        menuSet.add(new BubbleMenu());
        menuSet.add(new QuestionsAnswerMenu());
        menuSet.add(new ArticleMenu());
        menuSet.add(new CourseMenu());
        menuSet.add(new StoreMenu());
        return menuSet;
    }
}
