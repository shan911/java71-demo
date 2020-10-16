package com.kgc;

public class Test39 {
    //获取数组最大值和最小值操作：
    //利用Java的Math类的random()方法，随机生成10个数，
    // 填充一个数组，并找出产生10个随机数中最大的、最小的数。
    //提示：使用 int num=(int)(100*Math.random());
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (100 * Math.random());
        }
        System.out.println("数组中元素有：");
        for (int n : num) {
            System.out.println(n);
        }
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]> max  ) {
                max = num[i];
            }
            if (num[i]< min) {
                min = num[i];
            }
        }
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);

    }
}
