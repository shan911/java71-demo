package com.kgc;

import java.util.Scanner;

public class Test38 {
    //有一组学员的成绩{99，  85，82，63，60   }，将它们按降序排列。
    // 要增加一个学员的成绩，将它插入成绩序列，并保持降序
    public static void main(String[] args) {
        //int[] list = {99,85,82,63,60};//静态初始化-赋值
        int[] list = new int[6];
        list[0] = 99;
        list[1] = 85;
        list[2] = 82;
        list[3] = 63;
        list[4] = 60;

        Scanner input = new Scanner(System.in);
        System.out.println("请输入您要插入的学生成绩：");
        int num = input.nextInt();
        //找到num 要插入的位置 index  找到num比数组中元素(第一个)大的位置
        //当用户插入一个比原数组所有的数都小的数值的时候，int index =0；就会有问题
        //int index = 0;
        int index = list.length-1;
        for (int i = 0; i < list.length; i++) {
            if (num > list[i]) {
                index = i;
                break;
            }
        }
        //原 index 位置及以后的所有数据要整体的往后移
        for (int i = list.length - 1; i > index; i--) {
            list[i] = list[i - 1]; //list.length-1:5   list[5]=list[4]以此类推
        }
        //在index位置将num插入进去
        list[index] = num;
        System.out.println("插入的成绩的下标是：" + index);
        System.out.println("插入新的成绩最后的成绩是：");
        for (int listnum : list) {
            System.out.print(listnum + "\t");
        }
    }

}

