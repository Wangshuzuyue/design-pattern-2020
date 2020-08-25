package com.hzw.adapter;

/**
 * @author: huangzuwang
 * @date: 2020-03-11 16:36
 * @description:
 */
public abstract class AbstractAdapter<T> extends PassportService implements ILoginAdapter<T>{

    /**
     * 注册并登录
     * @param username
     * @param password
     * @return
     */
    protected String loginForRegister(String username, String password) {
        if (password == null){
            password = "PASS_EMPTY";
        }
        register(username, password);
        return login(username, password);
    }
}
