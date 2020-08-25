package com.hzw.Interpreter;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 11:58
 * @description: 加运算表达式
 */
public class AddExpression extends AbstractExpression {

    public AddExpression(MathExpression left, MathExpression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
