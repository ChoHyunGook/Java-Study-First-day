package com.bitkakao.web.bitkakao.bitkakaocirclearea;

import java.util.Scanner;

public class BitKakaoCircleAreaDemo2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        BitKakaoCircleAreaApp2 bitKakaoCircleAreaApp2=new BitKakaoCircleAreaApp2();
        System.out.println("반지름을 입력하세요.");
        System.out.println("원주율을 입력하세요.");
        int half= scanner.nextInt();
        double pi = scanner.nextFloat();
        String result = bitKakaoCircleAreaApp2.circleArea2(half,pi);
        System.out.println(result);

    }
}
