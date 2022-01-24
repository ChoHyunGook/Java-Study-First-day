package com.bitkakao.web.bitkakao.bitkakaocirclearea;

import java.util.Scanner;

public class BitKakaoCircleAreaApp { int half = 0;
    float pi = 3.14f;

    public String circleArea(int half) {
        this.half = half;

        double result = half * half * pi;

        return String.format("반지름 %d의 원넓이는 %d 입니다",this.half,result);

    }
}
