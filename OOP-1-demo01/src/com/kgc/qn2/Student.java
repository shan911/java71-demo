package com.kgc.qn2;

public class Student {
//    编写学员类，输出学员相关信息

    //属性 ：姓名   年龄    班级    爱好
    //姓名
    String name = "zhangsan";

    //年龄
    int age;

    //班级
    String className;

    //爱好
    String hobby;

    //方法：   输出个人信息
    public void drink(){
        System.out.println("喝牛奶！");
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println("年龄："+age);
        System.out.println("班级："+className);
        System.out.println("爱好："+hobby);
    }

    public void xinxi(){
        drink();
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.eat();
    }
}
