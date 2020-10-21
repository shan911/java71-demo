package com.kgc;

public class Test23 {
    public static void main(String[] args) {
        //用 while循环 实现100以内的数之和 1+2+3+....+100=
       /* int sum = 0;
        int num = 1;
        while (num<=100){
            sum += num; //累加 sum = sum + num
            num++;
        }
        System.out.println("1-100数字累加计算的和是：\n"+sum);*/

        //用 do-while循环 实现100以内的数之和 1+2+3+....+100=
        /*int sum = 0;
        int num = 1;
        do {
            sum += num; //累加 sum = sum + num
            num++;
        }while (num<=100);
        System.out.println("1-100数字累加计算的和是：\n"+sum);
*/

        //用 for循环 实现100以内的数之和 1+2+3+....+100=
        int sum = 0;
        for (int num = 1; num <= 100; num++) {
            sum += num;
        }
        System.out.println("1-100数字累加计算的和是：" + sum);
    }
}
