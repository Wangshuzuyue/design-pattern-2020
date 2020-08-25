package com.hzw.adapter;

import com.hzw.adapter.impl.MobileLoginAdapter;
import com.hzw.adapter.impl.QQLoginAdapter;
import com.hzw.adapter.impl.WechatLoginAdapter;

/**
 * @author: huangzuwang
 * @date: 2020-03-10 17:59
 * @description: 适配器类
 */
public class PassportForThirdAdapter implements IPassportForThirdAdapter{

//    /**
//     * 所有登录操作均走这个方法
//     * @param id
//     * @param clazz
//     * @return
//     */
//    private String processLogin(String id, Class<? extends ILoginAdapter> clazz){
//        try {
//            ILoginAdapter adapter = clazz.newInstance();
//            if (adapter.support(adapter)){
//                return adapter.login(id, adapter);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "";
//    }
//
//    @Override
//    public String loginForQQ(String openId) {
//        return processLogin(openId, QQLoginAdapter.class);
//    }
//
//    @Override
//    public String loginForWechat(String openId) {
//        return processLogin(openId, WechatLoginAdapter.class);
//    }
//
//    @Override
//    public String loginForMobile(String mobile, String code) {
//        return processLogin(mobile, MobileLoginAdapter.class);
//    }
}
