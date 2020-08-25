package com.hzw.adapter.impl;

import com.hzw.adapter.AbstractAdapter;
import com.hzw.adapter.entity.MobileLoginReq;

/**
 * @author: huangzuwang
 * @date: 2020-03-11 16:36
 * @description:
 */
public class MobileLoginAdapter extends AbstractAdapter<MobileLoginReq> {


    @Override
    public boolean support(Object adapter) {
        return adapter instanceof MobileLoginReq;
    }

    @Override
    public String login(MobileLoginReq req) {
        System.out.println("手机号登录");
        // TODO 验证码验证
        return super.loginForRegister(req.getMobile(), null);
    }
}
