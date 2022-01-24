package com.bitkakao.web.bitkakao.bitkakaologin;

import java.util.Scanner;

public class BitKakaoLoginDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BitKakaoLoginApp bitKakaoLoginApp = new BitKakaoLoginApp();
        System.out.println(" ID : ");
        System.out.println(" PASSWORD : ");
        System.out.println(" NAME : ");
        System.out.println(" BIRTHDAY : ");
        String id = scan.next();
        String pw = scan.next();
        String name = scan.next();
        int bir= scan.nextInt();

        String result = bitKakaoLoginApp.login(id,pw,name,bir);

        System.out.println(result);
    }
}
