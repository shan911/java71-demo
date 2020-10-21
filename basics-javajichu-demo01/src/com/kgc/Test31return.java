package com.kgc;

public class Test31return {
    //请实现输出1-10中4以下的数字
    public static void main(String[] args) {
        for (int i =1;i<10;i++){
            if (i%4 == 0){
                return;
            }
            System.out.println(i+" ");
        }
        System.out.println("循环结束！");
    }
}
