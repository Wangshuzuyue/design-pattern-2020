package com.hzw.Interpreter;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 11:47
 * @description: 计算器类
 */
public class MyCalculator {

    private Stack<MathExpression> stack = new Stack<>();

    public MyCalculator(String expression) {
        parse(expression);
    }

    /**
     * 解析表达式
     * @param expression
     */
    private void parse(String expression){
        String[] elements = expression.split(" ");
        parse(elements);
    }


    private void parse(String[] elements){
        for (int i = 0; i < elements.length; i++){
            String str = elements[i];
            if (OperatorUtil.isLeftBrackets(str)){
                //左括号
                String[] subElements = getSubElements(Arrays.copyOfRange(elements, i + 1, elements.length - 1));
                parse(subElements);
                i = i + subElements.length + 1;
            } else if (OperatorUtil.isOperator(str)){
                MathExpression left = this.stack.pop();
                NumExpression right;
                String ele = elements[++i];
                if (OperatorUtil.isLeftBrackets(ele)){
                    String[] subElements = getSubElements(Arrays.copyOfRange(elements, i + 1, elements.length - 1));
                    parse(subElements);
                    i = i + subElements.length + 1;
                    right = new NumExpression(this.stack.pop().interpret());
                }else{
                    right = new NumExpression(Integer.parseInt(ele));
                }
                System.out.println("出栈: " + left.interpret() + " 和 " + right.interpret());
                this.stack.push(OperatorUtil.getExpression(left, right, str));
            }else{
                //是数字表达式
                NumExpression numExpression = new NumExpression(Integer.parseInt(str));
                //入栈
                this.stack.push(numExpression);
                System.out.println("入栈:" + numExpression.interpret());
            }
        }
    }

    /**
     * 获取括号内的子表达式元素
     * @param elements
     * @return
     */
    public String[] getSubElements(String[] elements){
        int leftBracketsCount = 1;
        for (int i = 0; i < elements.length; i++){
            String element = elements[i];
            if (OperatorUtil.isLeftBrackets(element)){
                leftBracketsCount++;
            }else{
                if (OperatorUtil.isRightBrackets(element)){
                    leftBracketsCount--;
                    if (leftBracketsCount == 0){
                        return Arrays.copyOfRange(elements, 0, i);
                    }
                }
            }
        }
        return elements;
    }

    /**
     * 计算，返回结果
     * @return
     */
    public int calculate(){
        return stack.pop().interpret();
    }
}
