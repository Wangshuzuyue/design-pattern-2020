package com.hzw.command;

/**
 * @author: huangzuwang
 * @date: 2020-03-16 00:15
 * @description:
 */
public class FTPServer {

    public void user(){
        System.out.println("登录");
    }

    public void pass(){
        System.out.println("输入密码");
    }

    public void syst(){
        System.out.println("系统信息");
    }

    public void quit(){
        System.out.println("退出");
    }

    public void pasv(){
        System.out.println("请求服务器,等待数据连接");
    }

}
