package com.hzw.decorator;

/**
 * @author: huangzuwang
 * @date: 2020-03-05 14:08
 * @description:
 */
public class ArticleMenu implements Menu{
    @Override
    public String getName() {
        return "文章";
    }

    @Override
    public int getPriority() {
        return 200;
    }
}
