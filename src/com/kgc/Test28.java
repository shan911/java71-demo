package com.kgc;

public class Test28 {
    //1~10之间的整数相加，得到累加值大于20的当前数
    public static void main(String[] args) {
        int sum = 0; //和
        for (int i = 1; i <=10; i++) {
            sum += i; // 累加  sum = sum +i;
            if (sum > 20){
                System.out.println("累加值大于20的当前数是："+i);
                break;
            }
        }
    }
}
