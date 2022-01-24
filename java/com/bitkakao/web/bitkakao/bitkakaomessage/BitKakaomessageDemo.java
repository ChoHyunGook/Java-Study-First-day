package com.bitkakao.web.bitkakao.bitkakaomessage;

import java.util.Scanner;

public class BitKakaomessageDemo {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        BitKakaoMessageApp bitKakaoMessageApp = new BitKakaoMessageApp();
        System.out.println("전화번호를 입력하세요!");
        System.out.println("보내실 메세지를 입력하세요!");
        String phonenum = scanner.next();
        String message =scanner.next();
        String result = bitKakaoMessageApp.getMessage(phonenum,message);
        System.out.println(result);




    }
}
