package com.kgc;

public class Test32 {
    public static void main(String[] args) {
//多层循环的工作原理：外层循环循环变量变化一次，内层循环循环变量变化一遍
       /* for (int i = 1; i <= 6; i++) {
            System.out.println("外层循环循环变量 i=" + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println("\t内层循环循环变量 j=" + j);
                for (int k = 1; k <= 20; k++) {
                    System.out.println("\t\t最内层循环循环变量 k=" + k);
                }
            }
        }*/

//        5.1编写程序解决“百钱买百鸡”问题。公鸡五钱一只，母鸡三钱一只，小鸡
//        一钱三只，现有百钱欲买百鸡，共有多少种买法？
            /* 、编写程序解决“百钱买百鸡”问题。
             * 公鸡五钱一只，母鸡三钱一只，
             * 小鸡 一钱三只，
             * 现有百钱欲买百鸡，共有多少种买法？ */
            for(int g=0;g<=20;g++){
                for(int m=0;m<=33;m++){
                    for(int x=0;x<=100-g-m;x++){
                        if(x % 3==0 && 5*g+m*3+x/3 ==100 && g+m+x ==100){
                            System.out.println("公鸡"+g+"只母鸡"+m+"只小鸡"+x+"只");
                        }
                    }
                }
            }
    }
}
