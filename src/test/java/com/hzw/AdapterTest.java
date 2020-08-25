package com.hzw;

import com.hzw.adapter.ILoginAdapter;
import com.hzw.adapter.IPassportForThirdAdapter;
import com.hzw.adapter.PassportForThirdAdapter;
import com.hzw.adapter.entity.MobileLoginReq;
import com.hzw.adapter.entity.QQLoginReq;
import com.hzw.adapter.entity.WechatLoginReq;
import com.hzw.adapter.impl.MobileLoginAdapter;
import com.hzw.adapter.impl.QQLoginAdapter;
import com.hzw.adapter.impl.WechatLoginAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-03-10 16:11
 * @description:
 */
public class AdapterTest {

    private static List<ILoginAdapter> loginAdapterList = new ArrayList<>();
    static {
        loginAdapterList.add(new QQLoginAdapter());
        loginAdapterList.add(new WechatLoginAdapter());
        loginAdapterList.add(new MobileLoginAdapter());
    }

    public static void main(String[] args) {
//        IPassportForThirdAdapter adapter = new PassportForThirdAdapter();
//        adapter.loginForQQ("12321");
//        System.out.println("----------------------");
//        adapter.loginForWechat("12321");
//        System.out.println("----------------------");
//        adapter.loginForMobile("13666666666", "345678");

//        QQLoginReq req = new QQLoginReq();
//        WechatLoginReq req = new WechatLoginReq();
//        req.setOpenId("123211111");

        MobileLoginReq req = new MobileLoginReq();
        req.setMobile("13666666666");
        for (ILoginAdapter loginAdapter : loginAdapterList){
            if (loginAdapter.support(req)){
                loginAdapter.login(req);
            }
        }

    }
}
