package com.kgc;

import java.util.Scanner;

public class Test37 {
    //从键盘输入本次Java考试五位学生的成绩，求考试成绩最高分
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i=0;i< scores.length;i++){
            System.out.print("请输入第"+(i+1)+"位同学的JAVA成绩：");
            scores[i] = input.nextInt();//动态根据数组下标获取键盘输入的内容
        }
        //求考试成绩最高分
        int max = scores[0];
        for (int i = 1;i<scores.length;i++){
            if (scores[i]>max){
                max = scores[i];
            }
        }
        System.out.println("此次考试中JAVA成绩最高分为："+max);
    }
}
