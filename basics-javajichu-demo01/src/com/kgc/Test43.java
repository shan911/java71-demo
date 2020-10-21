package com.kgc;

import java.util.Arrays;

public class Test43 {
    /*向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
    1)统计每个数字出现了多少次
    2)输出出现次数最多的数字
    3)输出只出现一次的数字中最小的数字*/
    public static void main(String[] args) {
// 1. 声明源数组，包含10个0-9之间的随机数
        int[] src = new int[10];
// 2. 声明一个标记数组，存放的是0-9，10个数字
        int[] flag = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
// 3. 声明一个用来统计标记数组中数字在源
// 数组中的个数
        int[] count = new int[flag.length];
// 4. 给源数组赋值0-9之间的随机数
        for (int i = 0; i < src.length; i++) {
            src[i] = (int) (10 * Math.random());
        }
// 5. 统计标记数组中的每个元素在源数组中
// 有多少个即给count数组赋值
        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < src.length; j++) {
                // 如果标记数组中的数字在源数组中有，则count+1
                if (flag[i] == src[j]) {
                    count[i]++;
                }
            }
        }
// 6. 输出src和count的数据
        System.out.println("随机产生的数据如下:");
        System.out.println(Arrays.toString(src));
// System.out.println(Arrays.toString(count));

// a.统计每个数字出现的次数
// 如果count中的元素的值大于0，则输出其下标和值
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("数字" + i + "出现" + count[i] + "次");
            }
        }

// b.输出出现最多次数的数字
// 假设第一个统计的数字就是最多那个
        int max = count[0];
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }
        System.out.println("出现次数最多的数字是" + index);

// c. 输出只出现一次的数字中最小的数字
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                System.out.println("出现1次的数字中最小的是" + i);
                break;
            }
        }

    }
}
