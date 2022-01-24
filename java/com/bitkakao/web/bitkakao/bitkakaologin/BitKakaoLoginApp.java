package com.bitkakao.web.bitkakao.bitkakaologin;

import java.util.Scanner;

public class BitKakaoLoginApp {
    String id= "";
    String pw= "";
    String name = "";
    int bir = 0;

    public String login(String id,String pw, String name, int bir){
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.bir=bir;

        return String.format("ID : %s PASSWORD : %s NAME : %s BIRTH : %d",
                this.id,this.pw,this.name,this.bir);

    }
}
