package com.hzw.adapter.impl;

import com.hzw.adapter.AbstractAdapter;
import com.hzw.adapter.entity.QQLoginReq;

/**
 * @author: huangzuwang
 * @date: 2020-03-11 16:36
 * @description:
 */
public class QQLoginAdapter extends AbstractAdapter<QQLoginReq> {


    @Override
    public boolean support(Object adapter) {
        return adapter instanceof QQLoginReq;
    }

    @Override
    public String login(QQLoginReq req) {
        System.out.println("QQ登录");
        return super.loginForRegister(req.getOpenId(), null);
    }
}
