package com.bitcamp.web;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LoginApp loginApp= new LoginApp();
        System.out.println(loginApp.webSite);
        System.out.println("아이디를 입력하세요.");
        System.out.println("비밀번호를 입력하세요.");
        System.out.println("성함을 입력하세요.");
        System.out.println("생년월일을 입력하세요.(예시 950715");
        String id = scan.next();
        String pw = scan.next();
        String name = scan.next();
        int bir = scan.nextInt();
        String result = loginApp.Login(id,pw,name,bir);
        System.out.println(result);
    }
}
