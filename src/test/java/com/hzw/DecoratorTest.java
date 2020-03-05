package com.hzw;

import com.hzw.decorator.BaseMenuRoute;
import com.hzw.decorator.Menu;
import com.hzw.decorator.MenuRoute;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author: huangzuwang
 * @date: 2020-03-03 12:02
 * @description:
 */
public class DecoratorTest {
    public static void main(String[] args){

        //用户所被配置的权限
        List<String> permissionStrs = new ArrayList<>();
        permissionStrs.add("AssignmentMenuRoute");
        permissionStrs.add("QuestionRepertoryMenuRoute");
        permissionStrs.add("GrowWallMenuRoute");

        MenuRoute menuRoute = new BaseMenuRoute();
        menuRoute = addPermissibleMenu(menuRoute, permissionStrs);

        TreeSet<Menu> menus = menuRoute.getMenus();
        menus.forEach(menu -> {
            System.out.println(menu.getName());
        });
    }

    /**
     * 根据权限装饰 MenuRoute
     * @param menuRoute
     * @param permissionStrs
     * @return
     */
    static private MenuRoute addPermissibleMenu(MenuRoute menuRoute, List<String> permissionStrs){
        for (String permission : permissionStrs){
            String className = MenuRoute.class.getPackage().getName() + "." + permission;
            try {
                Class<?> menuRouteClass = Class.forName(className);
                Constructor<?> constructor = menuRouteClass.getConstructor(MenuRoute.class);
                menuRoute = (MenuRoute) constructor.newInstance(menuRoute);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return menuRoute;
    }
}
