package com.kgc;

import java.util.Arrays;
import java.util.Scanner;

public class Test48 {
    public static void main(String[] args) {
        //数组元素删除（减少）
        String[] names = {"Tome","Jack","Sam","Alice","Ruby","Robin"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的人员姓名：");
        String name = input.next();
        int j = -1;
        for (int i= 0;i<names.length;i++){
            if (name.equalsIgnoreCase(names[i])){//equalsIgnoreCase()忽略大小写比较两个字符串内容是否相等，相等返回true，否则返回false
                j = i;
                break;
            }
        }
        System.out.println("j="+j);
        if (j !=-1){
            for (int i=j;i<names.length-1;i++){
                names[i]=names[i+1];
            }
            System.out.println(Arrays.toString(names));
            names[names.length-1]=null;
        }else {
            System.out.println("很抱歉，没有您要删除的名字！");
        }
        System.out.println("删除后的人员姓名是：");
        for (int i=0;i<names.length-1;i++){//此输出排除了 最后一个元素 null 的输出
            System.out.print(names[i]+"\t");
        }
        for (String item : names){//此输出会导致最后一个元素 null 的输出
            System.out.print(item+"\t");
        }
    }
}
