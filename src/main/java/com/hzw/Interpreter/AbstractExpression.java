package com.hzw.Interpreter;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 11:54
 * @description: 抽象 非终结表达式
 */
public abstract class AbstractExpression implements MathExpression {

    protected MathExpression left;

    protected MathExpression right;

    public AbstractExpression(MathExpression left, MathExpression right) {
        this.left = left;
        this.right = right;
    }


}
