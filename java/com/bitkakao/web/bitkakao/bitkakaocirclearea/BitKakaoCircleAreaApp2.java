package com.bitkakao.web.bitkakao.bitkakaocirclearea;

public class BitKakaoCircleAreaApp2 {
    int half;
    double pi;

    public String circleArea2(int half,double pi){
        this.half=half;
        this.pi=pi;

        double result= half*half*pi;

        return String.format("반지름 %d와 원주율 %3f의 원넓이는 %3f 입니다.",
                this.half,this.pi,result);
    }

}
