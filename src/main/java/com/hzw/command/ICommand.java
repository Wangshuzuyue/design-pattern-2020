package com.hzw.command;

/**
 * @author: huangzuwang
 * @date: 2020-03-16 00:20
 * @description:
 */
public interface ICommand {

    void execute();

    void setServer(FTPServer server);
}
