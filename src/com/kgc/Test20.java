package com.kgc;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
       /* String answer; //标识是否合格
        Scanner input = new Scanner(System.in);
        System.out.println("学习合格了吗？（y/n）");
        answer = input.next();
        while (!"y".equals(answer)){
            System.out.println("上午阅读教材，学习理论部分");
            System.out.println("下午上机编程");
            System.out.println("学习合格了吗？（y/n）");
            answer = input.next();
        }
        System.out.println("完成了学习的任务");*/

        //用 while循环 实现100以内的偶数之和 2+4+6+....+100=
        //声明 变量  赋值 2；
      /* int sum = 0; //当前之和
       int num = 2; //加数
       while (num <= 100){
           sum = sum + num; //累加
           num = num+2;
       }
        System.out.println("100以内的偶数和是："+sum);*/

        //用 do-while循环 实现100以内的偶数之和 2+4+6+....+100=
        /*int sum = 0;
        int num = 2;
        do {
            sum += num; //累加
            num = num +2;
        }while (num<=100);
        System.out.println("100以内的偶数和是："+sum);
    }*/

        int sum = 0;
        for (int num = 2; num <= 100; num = num + 2) {
            sum += num;
        }
        System.out.println("100以内的偶数和是：" + sum);

    }
}
