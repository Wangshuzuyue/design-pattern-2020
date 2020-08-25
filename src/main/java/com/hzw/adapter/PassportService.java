package com.hzw.adapter;

/**
 * @author: huangzuwang
 * @date: 2020-03-10 17:59
 * @description: 待适配的旧类
 */
public class PassportService {

    public String register(String username, String password){
        System.out.println(String.format("账号密码注册:用户名[%s], 密码[%s]", username, password));
        return "注册成功";
    }

    public String login(String username, String password){
        System.out.println(String.format("账号密码登录:用户名[%s], 密码[%s]", username, password));
        return "登录成功";
    }

}
