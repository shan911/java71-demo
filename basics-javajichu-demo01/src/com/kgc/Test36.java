package com.kgc;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Test36 {
    //猜数游戏
    /*有一个数列：8，4，2，1，23，344，12
    循环输出数列的值
    求数列中所有数值的和
    猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数*/
    public static void main(String[] args) {
            int[] list = new int[]{8,4,2,1,23,344,12};
            int sum = 0;
            for (int num : list){
                System.out.println(num);
                sum += num;
            }
        System.out.println("所列所有数组的和为："+sum);
        Scanner input = new Scanner(System.in);//通过键盘输入开始猜数
        System.out.println("请输入一个整数：");
        int guess= input.nextInt();
        boolean flag = false;  //猜测结果
        for (int num : list){
            if (num == guess){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("恭喜您，此数列中包含这个数");
        }else {
            System.out.println("抱歉，此数列中不包含这个数");
        }
    }
}
