package com.lec.android.aaa;

// 샘플 데이터
public class D {


    public static final String [] NAME = {
            "a", "b", "c"
    };

    public static final int [] AGE = {11, 22, 33
    };

    public static final String [] ADDRESS = {
            "a1a1",
            "a2a2",
            "a3a3"
    };

    private static int idx = 0;

    public static int next(){
        idx = idx % NAME.length;
        return idx++;   // idx 값 리턴하고 1증가
    }





} // end D

















