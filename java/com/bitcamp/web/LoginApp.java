package com.bitcamp.web;

public class LoginApp {
    public static String webSite = "Login Web";

    private String id;
    private String pw;
    private String name;
    private int bir;

    public String Login(String idParm, String pwParm, String nameParm, int birParm ){
        id = idParm;
        pw = pwParm;
        name = nameParm;
        bir = birParm;

        return name + " 님의 ID는 " + id + "이고, PW는 " + pw + "이며, 생년월일은 "
                + bir + "입니다.";

    }
}
