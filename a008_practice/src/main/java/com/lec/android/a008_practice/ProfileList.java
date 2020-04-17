package com.lec.android.a008_practice;

public class ProfileList {
    public static final String [] NAME = {
    "aaa", "bbb", "ccc"
    };


    public static int [] etAge = {
          11, 22, 33
    };


    public static final String [] etAdd = {
            "a1a1", "b2b2", "c3c3"
    };


    private static int idx = 0;

    public static int next(){
        idx = idx % NAME.length;
        return idx++;   // idx 값 리턴하고 1증가
    }
}
