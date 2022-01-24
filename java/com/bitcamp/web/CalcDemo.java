package com.bitcamp.web;

import java.util.Scanner;

public class CalcDemo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp= new CalcApp();
        System.out.println(calcApp.webSite);
        System.out.println("첫번째 숫자를 입력해주세요.");
        System.out.println("두번째 숫자를 입력해주세요.");
        System.out.println("부호를 넣어주세요.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String op = scanner.next();

        String result = calcApp.Calc(num1,num2,op);
        System.out.println(result);
    }
}
