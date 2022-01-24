package com.bitkakao.web.bitkakaohello;

import java.util.Scanner;

public class BitKakaoHelloDemo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        BitKakaoHelloApp bitKakaoHelloApp= new BitKakaoHelloApp();
        System.out.println(bitKakaoHelloApp.hello);
        System.out.println("첫번째숫자");
        System.out.println("두번째숫자");
        System.out.println("부호");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String op = scanner.next();
        String result = bitKakaoHelloApp.helloworld(num1,num2,op);
        System.out.println(result);

    }
}
