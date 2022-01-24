package com.bitcamp.web;

public class CalcApp {
    public static String webSite = "Calcculator Program";
    private int num1;
    private int num2;
    private String op;

    public String Calc(int num1Parm, int num2Parm, String opParm){
        num1 = num1Parm;
        num2 = num2Parm;
        op = opParm;

        int result = num1 + num2;

        return num1 + op + num2 + "의 값은 " + result + "입니다.";
    }
}
