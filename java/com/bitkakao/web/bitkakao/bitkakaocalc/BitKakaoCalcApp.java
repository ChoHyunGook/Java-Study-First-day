package com.bitkakao.web.bitkakao.bitkakaocalc;

public class BitKakaoCalcApp{
    int num1= 0;
    int num2= 0;
    String op= "";

    public String kakaocalc(int num1,int num2,String op){
        this.num1=num1;
        this.num2=num2;
        this.op=op;
        int result = num1 + num2;

        return String.format("%d,%s,%d 의 값은 %d 입니다.",
                this.num1,this.op,this.num2,result);
    }
}
