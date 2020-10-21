package com.kgc;

public class Test30 {
    public static void main(String[] args) {
        //请实现输出1-10中非4的倍数的数字
      /*  for (int i = 1; i < 10; i++) {
            if (i%4==0){
                continue;
            }
            System.out.println(i+" ");
        }
        System.out.println("循环结束！");
*/
        //求1~10之间的所有偶数和
      /*  int sum = 0;
        for (int i =0;i<=10;i++){
            if (i%2==1){
                continue;//如果i为奇数，结束本次循环，进行下一次的循环
            }
            sum += i;
        }
        System.out.println("1-10之间的偶数之和是："+sum);*/

    //4.1打印出1-100之间所有不是7的倍数和不包含7的数字，并求和
    /*    int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i %7 == 0 || i %10 == 7 || i/10 == 7){//注意：70-79容易漏掉
                continue;
            }
            sum += i;
        }
        System.out.println(sum);*/

//        4.2有一个有钱的神经病，他往银行里存钱，
//        第一天存 1 元,以后每天比前一天多存 50%，完成下列计算任务
//        1)他存到第几天，当天存的钱会超过10元
        /*double money=1;
        int day=1;
        while(money <10) {
            money *=1.5;
            day++;
            System.out.println("day:"+day+",money:"+money);
        }
        System.out.println(day);

        //2)一个月（30天）后，他总共存了多少钱
        double sum=0;
        double mo=1;
        for(int i=1;i<=30;i++) {
            sum +=mo;
            System.out.println("i:"+i+",money:"+mo+",sum:"+sum);
            mo *=1.5;
        }
        System.out.println(sum);*/

        //4.3井里有一只蜗牛，他白天往上爬 5米，晚上掉 3.5米，井深 56.7米
        //     计算蜗牛需要多少天才能从井底到爬出来
       /* int day = 1;//天数
        double sum=0;//爬过的距离
        while(true) {
            //白天向上爬5米
            sum +=5;
            System.out.println("day:"+day+",sum:"+sum);
            if(sum >=56.7) {//如果爬出了井
                //退出循环
                break;
            }
            //晚上掉3.5;
            sum -=3.5;
            day++;
        }
        System.out.println(day);
*/
        //猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
        //程序分析：采取逆向思维的方法，从后往前推断。
//        分析：第10天剩下1个桃子，其实是第9天它吃过了第8天剩下的一半又吃了一个后剩下的
//        那么，倒过来算，第9天还没吃之前应该是(1+1)*2，当天还没吃之前的桃子数是吃过之后剩下的
//        桃子数加上一再乘以二。
        int sum=1;//第十天桃子的数量
        for (int i =2; i <=10;i++) {//倒数第二天才开始计算
            sum =sum*2+2;
        }
        System.out.println("第一天猴子摘的桃子数为："+sum);

    }

}
