package com.kgc;

import java.util.Scanner;

public class Test56 {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int x=0;
        int y=a.length/2; //奇宫格，a.length是偶数。
        a[x][y]=1;//定义1的位置
        for (int i = 2; i <=a.length*a.length; i++) {
            //拿着1的坐标去找2的坐标，上右
            //上
            x=x-1;
            if(x<0) {
                x = a.length - 1;
            }//if只有一条语句可以省略括号
            //右
            y=y+1;
            if(y>a.length-1) {
                y = 0;
            }

            if(a[x][y]!=0){//如果位置被占
                //下下左
                x=x+1;
                if(x>a.length-1) {
                    x = 0;
                }
                x=x+1;
                if(x>a.length-1) {
                    x = 0;
                }
                y=y-1;
                if(y<0) {
                    y = a.length - 1;
                }
                a[x][y]=i;
            }else{
                a[x][y]=i;
            }
        }
//打印
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
