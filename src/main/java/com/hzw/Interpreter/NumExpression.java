package com.hzw.Interpreter;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 11:54
 * @description: 数字解释器 【终结表达式】
 */
public class NumExpression implements MathExpression {

    private int value;

    public NumExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }

}
