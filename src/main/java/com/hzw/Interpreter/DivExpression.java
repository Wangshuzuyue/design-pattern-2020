package com.hzw.Interpreter;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 11:58
 * @description: 乘运算表达式
 */
public class DivExpression extends AbstractExpression {

    public DivExpression(MathExpression left, MathExpression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
