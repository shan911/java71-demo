package com.kgc;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        /*for (int i=1;i<101;i++){
            System.out.println("第"+i+"遍：好好学习天天向上");
        }*/
        //循环输入某同学Semester1结业考试的5门课成绩，
        // 并计算平均分。

        int score;
        int sum = 0;
        double avg = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = input.next();
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"门课的成绩");
            score = input.nextInt(); //接收键盘输入的成绩
            sum = sum +score; //计算成绩和
        }
        avg = (double) sum/5;
        System.out.println(name+"的平均分是："+avg);
    }
}
