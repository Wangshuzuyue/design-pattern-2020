package com.hzw.adapter.impl;

import com.hzw.adapter.AbstractAdapter;
import com.hzw.adapter.entity.WechatLoginReq;

/**
 * @author: huangzuwang
 * @date: 2020-03-11 16:36
 * @description:
 */
public class WechatLoginAdapter extends AbstractAdapter<WechatLoginReq> {


    @Override
    public boolean support(Object adapter) {
        return adapter instanceof WechatLoginReq;
    }

    @Override
    public String login(WechatLoginReq req) {
        System.out.println("微信登录");
        return super.loginForRegister(req.getOpenId(), null);
    }
}
