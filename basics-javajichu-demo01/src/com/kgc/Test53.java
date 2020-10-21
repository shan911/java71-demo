package com.kgc;

import java.util.Scanner;

public class Test53 {
    //有5个班各5名学生某门课程的成绩，如何计算5个班各自的总成绩
    public static void main(String[] args) {
        int[][] scores = new int[3][3];
        Scanner input = new Scanner(System.in);
        //外层循环 --班 （内循环   --班级的学生）
        for (int i=0;i<scores.length;i++){
            System.out.println("第"+(i+1)+"个班");
            for (int j =0;j<scores[i].length;j++){
                System.out.println("请输入第"+(i+1)+"个班第"+(j+1)+"个同学的成绩");
                scores[i][j] = input.nextInt();
            }
        }
        //完成5个班级的成绩统计
        System.out.println("统计考试成绩：");
        for (int i=0;i<scores.length;i++){
            int sum = 0;
            for (int j = 0;j<scores[i].length;j++){
                sum +=scores[i][j];
            }
            System.out.println("第"+(i+1)+"个班的同学的总成绩是："+sum);
        }
    }
}
