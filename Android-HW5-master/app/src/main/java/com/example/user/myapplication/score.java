package com.example.user.myapplication;

/**
 * Created by user on 2017/4/25.
 */

public class score {

    int hostImg;
    String hostName;
    String hostScore;
    int guestImg;
    String guestName;
    String guestScore;


    score(int hostImg, String hostName, String hostScore, int guestImg, String guestName, String guestScore){

        this.hostImg = hostImg;
        this.hostName = hostName;
        this.hostScore = hostScore;
        this.guestImg = guestImg;
        this.guestName = guestName;
        this.guestScore = guestScore;
    }
}

