package com.bitkakao.web.bitkakao.bitkakaocirclearea;

import java.util.Scanner;

public class BitKakaoCircleAreaDemo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        BitKakaoCircleAreaApp bitKakaoCircleAreaApp =new BitKakaoCircleAreaApp();
        System.out.println("반지름을 입력하세요");
        int half = scanner.nextInt();
        String result = bitKakaoCircleAreaApp.circleArea(half);
        System.out.println(result);


    }
}
