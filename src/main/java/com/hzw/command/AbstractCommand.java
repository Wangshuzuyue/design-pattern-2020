package com.hzw.command;

/**
 * @author: huangzuwang
 * @date: 2020-03-16 00:20
 * @description:
 */
public class AbstractCommand implements ICommand{

    protected FTPServer server;

    @Override
    public void execute() {
        if (server == null){
            throw new RuntimeException("未发现FTP服务器");
        }
    }

    @Override
    public void setServer(FTPServer server) {
        this.server = server;
    }
}
