package com.kgc;

import java.util.Scanner;

public class Test41 {
    //使用冒泡排序对输入的5名学员成绩进行降序排列
    public static void main(String[] args) {
        int[] scores=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入5名学员的成绩：");
//获取学员成绩
        for(int i=0;i<scores.length;i++){
            scores[i]=input.nextInt();
        }
//冒泡排序学员成绩
        for (int i = 0; i < scores.length -1 ; i++){
            for (int j = 0; j < scores.length -1 - i ; j++){
                if (scores[j] < scores[j + 1]){// 交换元素
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        System.out.print("学员成绩按降序排列：");
        for(int score:scores){
            System.out.print(score+"\t");
        }

    }
}
