package com.kgc.qn1;

public class Person {
    //属性（成员变量）：
    String name;   //姓名
    char sex;     //性别
    int age;     //年龄

    //方法（成员方法）：吃、喝
    public void eat(){
        System.out.println("吃饭！");
    }

    public void drink(){
        System.out.println("喝牛奶！");
    }

    public void showInfo(){
        System.out.println("我叫："+name+";我是"+sex+"生；今年"+age+"岁");
    }


}
