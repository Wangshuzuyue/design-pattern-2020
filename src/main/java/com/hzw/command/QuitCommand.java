package com.hzw.command;

/**
 * @author: huangzuwang
 * @date: 2020-03-16 00:20
 * @description:
 */
public class QuitCommand extends AbstractCommand{

    @Override
    public void execute() {
        super.execute();
        server.quit();
    }
}
