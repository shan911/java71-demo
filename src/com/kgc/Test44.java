package com.kgc;

import java.util.Arrays;

public class Test44 {
    //倒置数组元素
    public static void main(String[] args) {
        int[] arr = {7,1,5,2};
        int i = 0;//定义第一个数组元素下标
        int j = arr.length-1;//定义最后一个数组元素下标
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
