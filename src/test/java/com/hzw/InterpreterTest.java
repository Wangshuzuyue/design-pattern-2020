package com.hzw;

import com.hzw.Interpreter.MyCalculator;

/**
 * @author: huangzuwang
 * @date: 2020-03-22 12:02
 * @description:
 */
public class InterpreterTest {

    public static void main(String[] args) {

        System.out.println("计算结果: " + new MyCalculator("( ( 5 - 4 ) + 2 + 3 ) + 15 + 20 + 56 - ( 2 + 3 ) - 11 - ( 10 + 10 )").calculate());
    }
}
