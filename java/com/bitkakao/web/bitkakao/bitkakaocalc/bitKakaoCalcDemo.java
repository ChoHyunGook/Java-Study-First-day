package com.bitkakao.web.bitkakao.bitkakaocalc;

import java.util.Scanner;

public class bitKakaoCalcDemo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        BitKakaoCalcApp bitKakaoCalcApp= new BitKakaoCalcApp();
        System.out.println("첫번째숫자");
        System.out.println("두번째숫자");
        System.out.println("부호");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String op = scanner.next();

        String result = bitKakaoCalcApp.kakaocalc(num1, num2, op);

        System.out.println(result);
    }
}
