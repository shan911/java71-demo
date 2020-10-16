package com.kgc;

public class Test35 {
    //数组越界
    // 控制台会报错 ArrayIndexOutOfBoundsException（数组下标值超出数组的正常范围）
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
    //	at com.kgc.Test35.main(Test35.java:9)
    public static void main(String[] args) {
        int[ ] score = new int[3];
        score[0] = 89;
        score[1] = 63;
        score[2] = 79;
        //score[3] = 43;
        System.out.println(score[3]);

    }
}
