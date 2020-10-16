package com.kgc;

import java.util.Arrays;

public class Test42 {
    public static void main(String[] args) {
        /*向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
        1)升序输出、降序输出
        2)输出总和、平均数*/
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (10 * Math.random());
        }
        Arrays.sort(num); //升序排列数组
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("------升序------");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println("------降序------");

// 总和
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = num[i] + sum;
        }
        System.out.println("总和：" + sum);

// 平均数
        int avg = 0;
        for (int i = 0; i < num.length; i++) {
            avg = num[i] + avg;
        }
        System.out.println("平均数：" + avg / num.length);

    }
}
