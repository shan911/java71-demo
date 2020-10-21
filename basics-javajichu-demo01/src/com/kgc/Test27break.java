package com.kgc;

import java.util.Scanner;

public class Test27break {
    //循环录入某学生5门课的成绩并计算平均分，
    // 如果某分数录入为负，停止录入并提示录入错误
    public static void main(String[] args) {
        int score;
        int sum = 0;
        int avg;
        boolean isNegative = false; //是否为负数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = input.next();
        for (int i = 0;i < 5;i++){
            System.out.println("请输入第"+(i+1)+"门课的成绩！");
            score = input.nextInt();
            if(score < 0){
                isNegative = true;
                break;
            }
            sum +=score; //累加求和
        }
        if(isNegative){
            System.out.println("抱歉，分数录入错误，请重新输入！");
        }else{
            avg =sum/5;
            System.out.println(name+"的平均分是："+avg);
        }
    }
}
