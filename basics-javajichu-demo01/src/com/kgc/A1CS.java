package com.kgc;

import java.util.Arrays;

public class A1CS {
    public static void main(String[] args) {
        int[]scores={78,100,50,79,82};
        System.out.println("冒泡排序前");
        for(int score:scores){
            System.out.printf(scores+"|t");
        }
        int index=scores.length-1;
        for(int i=0;i<scores.length-1;i++){//循环
            for(int j=0;j<scores.length-1-i;j++){
                if (scores[j]>scores[j+1]){
                    int temp=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;
                }
            }
            System.out.println("冒泡排序后");
            for(int num:scores){
                System.out.println(num);
            }
        }



    }
}











