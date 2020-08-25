package com.hzw.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-03-16 00:15
 * @description:
 */
public class FTPClient {

    private List<ICommand> commands = new ArrayList<>();

    private FTPServer server;

    public FTPClient(FTPServer server) {
        this.server = server;
    }

    public void exxcute(){
        for (ICommand command : commands){
            command.setServer(server);
            command.execute();
        }
    }

    public FTPClient addCommand(ICommand command){
        commands.add(command);
        return this;
    }

}
