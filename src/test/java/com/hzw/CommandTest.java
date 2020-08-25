package com.hzw;

import com.hzw.adapter.ILoginAdapter;
import com.hzw.adapter.entity.MobileLoginReq;
import com.hzw.adapter.impl.MobileLoginAdapter;
import com.hzw.adapter.impl.QQLoginAdapter;
import com.hzw.adapter.impl.WechatLoginAdapter;
import com.hzw.command.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-03-10 16:11
 * @description:
 */
public class CommandTest {

    public static void main(String[] args) {
        FTPServer server = new FTPServer();
        FTPClient client = new FTPClient(server);

        client.addCommand(new UserCommand())
                .addCommand(new PassCommand())
                .addCommand(new SystCommand())
                .addCommand(new PasvCommand())
                .addCommand(new QuitCommand());

        client.exxcute();

    }
}
