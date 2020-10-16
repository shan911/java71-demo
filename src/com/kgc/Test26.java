package com.kgc;

public class Test26 {
    //打印9*9乘法表 1*1=1 2*3=6
    public static void main(String[] args) {
        int i,j; //循环变量
        for (i = 1; i <= 9; i++) {
            for (j=1;j <= i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
                //String.format 格式化字符串
                //System.out.print(String.format("%d*%d=%d ",i,j,j*i));
            }
            System.out.println();//打印一行后换行


            /*双重循环的使用
            * 外层 循环变量变化 一次， 内层 循环变量变化 一遍
            * 找规律很重要，固定写法可以记忆，代码理解
            * 需要先确定外层循环，内层循环
            * 多练习，举一反三
            * */

        }
    }
}
