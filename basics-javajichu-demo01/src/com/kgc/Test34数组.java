package com.kgc;

import java.util.Scanner;

public class Test34数组 {
    //Java考试结束后，老师给王子健分配了一项任务，
    // 让他计算全班（30人）Java课程考试的平均分
    public static void main(String[] args) {
        double[] scores = new double[3];//声明数组类型  分配数组空间
        //int[] s = {89,98,78};     边声明同时边赋值
        //int[] s1=new int[]{100,90,80};  边声明同时边赋值 new int[]{100,90,80}切记不可以定义数组长度
        double avg = 0;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        //传统的for循环的方式 为数组赋值
        //使用for循环来遍历数组的元素下标 下标 0 -->数组长度
        for (int i=0;i< scores.length;i++){
            System.out.print("请输入第"+(i+1)+"位同学的JAVA成绩：");
            scores[i] = input.nextDouble();//动态根据数组下标获取键盘输入的内容

        }
        //增强for（foreach）:迭代为数组元素操作
        //增强型for(数据类型 变量名称 ：数组名称[数组元素]){循环体代码}
        for (double score:scores){ //double score=scores[0],double score=scores[1]
            sum +=score;
        }

        avg = sum/scores.length;
        System.out.println("张浩班级的同学的JAVA成绩平均分是："+avg);
       /* int score = 0;
        double avg = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入第"+i+"位同学的Java成绩：");
            score = input.nextInt();
            sum += score;
        }
        avg =(double) sum/3;
        System.out.println("王子健同学班级的Java平均分为："+avg);*/
    }
}
