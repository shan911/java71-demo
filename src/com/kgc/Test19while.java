package com.kgc;

public class Test19while {
    public static void main(String[] args) {
//        打印100遍好好学习天天向上
//        int i = 1;
//        while (i <= 100) {
//            System.out.println("第" + i + "遍编写：好好学习天天向上！");
//            i++;
//        }
      /*  循环打印50份试卷
      int j = 1;
        while (j<=50){
            System.out.println("打印第"+j+"份试卷");
            j++;
        }
*/
        //用 while循环 实现100以内的偶数之和 2+4+6+....+100=
        //声明 变量  赋值 2；
      /* int sum = 0; //当前之和
       int num = 2; //加数
       while (num <= 100){
           sum = sum + num; //累加
           num = num+2;
       }
        System.out.println("100以内的偶数和是："+sum);*/

//用 do-while循环 实现100以内的偶数之和 2+4+6+....+100=
       /*int sum = 0;
       int num = 2;
       do {
           sum = sum + num; //累加
           num = num+2;
       }while (num <= 100);
        System.out.println("100以内的偶数和是："+sum);*/

        //使用for循环 实现100以内的偶数之和 2+4+6+....+100=
        int sum = 0;
        for (int num = 2;num <=100;num=num+2){
            sum +=num;  //累加 sum = sum + num
        }
        System.out.println("100以内的偶数之和 "+sum);
    }
}
