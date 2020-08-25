package com.hzw.Interpreter;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 11:58
 * @description: 减运算表达式
 */
public class SubExpression extends AbstractExpression {

    public SubExpression(MathExpression left, MathExpression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
