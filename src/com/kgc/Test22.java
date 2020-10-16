package com.kgc;

import java.util.Scanner;

public class Test22 {
    //输入一个整数，输出其加法表
    public static void main(String[] args) {
        int i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int val = input.nextInt(); //获取键盘输入的整数值
        System.out.println("根据这个数值可以输出以下加法表：");
        for (i = 0,j=val;i<=val;i++,j--) {
            //for(表达式1 ；表达式2 ；表达式3）
            //表达式1(循环变量初始化 i 初识值 0 ，j初始值是键盘输入获取的值)
            //表达式2(循环条件判断  i <= 键盘输入获取的值 val)
            //表达式3(循环更新变量 i++ i循环+1, j-- j循环-1)
            System.out.println(i+"+"+j+"="+(i+j));
            // + 拼接    "+" 输出 +的字符
        }
    }
}
