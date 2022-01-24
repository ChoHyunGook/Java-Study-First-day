package com.bitkakao.web.bitkakao.bitkakaomessage;

public class BitKakaoMessageApp {
    String phonenum="";
    String message="";

    public String getMessage(String phonenum, String message){
        this.phonenum=phonenum;
        this.message=message;

        return String.format("%s 에 %s 를 보냈습니다!!",
                this.phonenum, this.message);
    }

}
