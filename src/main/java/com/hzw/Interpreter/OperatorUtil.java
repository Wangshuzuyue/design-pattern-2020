package com.hzw.Interpreter;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 14:13
 * @description:
 */
public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
            return true;
        }
        return false;
    }

    /**
     * 是否是左括号
     * @param symbol
     * @return
     */
    public static boolean isLeftBrackets(String symbol) {
        if (symbol.equals("(")) {
            return true;
        }
        return false;
    }

    /**
     * 是否是右括号
     * @param symbol
     * @return
     */
    public static boolean isRightBrackets(String symbol) {
        if (symbol.equals(")")) {
            return true;
        }
        return false;
    }


    public static MathExpression getExpression(MathExpression left, MathExpression right, String symbol) {
        MathExpression expression;
        switch (symbol) {
            case "+":
                expression = new AddExpression(left, right);
                break;
            case "-":
                expression = new SubExpression(left, right);
                break;
            case "*":
                expression = new MultiExpression(left, right);
                break;
            case "/":
                expression = new DivExpression(left, right);
                break;
            default:
                return null;
        }
        return expression;
    }

}
