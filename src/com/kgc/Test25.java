package com.kgc;

public class Test25 {
    public static void main(String[] args) {
/*        //打印矩形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印平行四边形
        //输出一行空格 + *
        for (int i = 1; i <= 5; i++) {
            //输出每行里面的空格
             *//*行    空格  5-i
            *  1      4
            *  2      3
            *  3      2
            *  4      1
            *  5      0
            * *//*
            for (int k=1;k <= 5-i;k++){
                System.out.print(" ");
            }
            //输出每行里面的 5 列 *
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }//换到下一行
            System.out.println();
        }
*/

        //打印等腰三角形
        for (int i = 1; i <= 5; i++) {

            for (int k=1;k <= 5-i;k++){
                System.out.print(" ");
            }
            //输出每行里面的* 2*i-1
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*
//打印菱形
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(5-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//打印数字菱形
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(5-i);
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(5-i)-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }

//打印 空心 菱形
        for (int i = 1;i <= 5;i++){
            for (int j = 1;j <= 5-i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k <= 2*i-1;k++){
                if (k == 1 || k == 2*i-1){
                    System.out.print("8");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1;i <= 4;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k <= 2*(5-i);k++){
                if (k == 1 || k == 2*(5-i)-1){
                    System.out.print("8");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/




        //打印爱心  爱心的公式 （x²+y²-1）³-x²*y³=0
       /* for(float y = (float) 1.5;y>-1.5;y -= 0.1) {
            for (float x = (float) -1.5; x < 1.5; x += 0.05) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //打印圆形
        /*int r=6;//圆形的半径
        for (int y = 0; y <= 2 * r; y += 2) {//y的步长为2,改变y的步长可以将圆形变成椭圆
            int x = (int) Math.round(r - Math.sqrt(2 * r * y - y * y));
            int len = 2 * (r - x);

            for (int i = 0; i <= x; i++) {
                System.out.print(' ');
            }
            System.out.print('*');

            for (int j = 0; j <= len; j++) {
                System.out.print(' ');
            }
            System.out.println('*');
        }*/
        }
}
