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

    //带返回值的方法： 返回给你这个人的姓名-String
    //return一个 和 方法返回值类型一致的值
    //return 一个值
    //return  返回值  跳出方法
    public String getName(){
        return name;
    }

    public void zuoxi(){
        eat();
        drink();
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        p.zuoxi();
    }
}
