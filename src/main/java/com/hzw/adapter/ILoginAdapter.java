package com.hzw.adapter;

/**
 * @author: huangzuwang
 * @date: 2020-03-10 18:15
 * @description:
 */
public interface ILoginAdapter<T> {

    /**
     * 是否支持适配
     * @param req
     * @return
     */
   boolean support(Object req);

    /**
     * 登录
     * @param req 登录参数实体
     * @return
     */
   String login(T req);
}
