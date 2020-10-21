package com.kgc;

import java.util.Scanner;

public class Test24 {
    //从控制台输入一个数n,使用for循环实现求n!
    //提示：n!（阶乘）=n*(n-1)*(n-2)*…*1
    //升级：求1！+2！+3！…+n！的值
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = input.nextInt();

        int sum = 0;
        int result = 1;
        for (int i=1;i<=n;i++){
            result *=i;// result =result*i;
            sum += result;
        }
        System.out.println(n+"的阶乘是："+result);
        System.out.println("1!+..."+n+"!阶乘和是:"+sum);
    }
}
