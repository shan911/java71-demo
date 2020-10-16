package com.kgc;

import java.util.Scanner;

public class Test33 {
    //3.1输入年份和月份，输出这个月应该有多少天（使用switch结构）
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scan.nextInt();

        System.out.println("请输入月份");
        int month = scan.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("29天");
                } else {
                    System.out.println("28天");
                }
        }*/
        //3.2编写程序，对输入的年、月、日，给出该天是该年的第多少天？
            Scanner sc =new Scanner(System.in);
            System.out.print("请输入年：");
            int year=sc.nextInt();

            System.out.print("请输入月：");
            int month=sc.nextInt();

            System.out.print("请输入日：");
            int day=sc.nextInt();

            int days = 0;

            switch(month){
                case 12: days +=30;
                case 11: days +=31;
                case 10: days +=30;
                case 9: days +=31;
                case 8: days +=31;
                case 7: days +=30;
                case 6: days +=31;
                case 5: days +=30;
                case 4: days +=31;
                case 3: days +=31;
                case 2:
                    if((year%4==0&&year%100!=0)||(year%400==0)){
                    days +=29;
                }
                else{
                    days +=28;
                }
                case 1:days +=day;
            }
            System.out.print("第" + days + "天");

    }


}
