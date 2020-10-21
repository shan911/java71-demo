package com.kgc.qn2;

public class Teacher {
    //    编写教师类，输出教师相关信息

    //属性 ：姓名   专业    教授课程    教龄
    //姓名
    String name;

    //专业
    String major;

    //课程
    String subject;

    //教龄
    int  teacherAge;

    //方法：   输出个人信息
    public void eat(){
        System.out.println("吃饭！");
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println("专业："+major);
        System.out.println("课程："+subject);
        System.out.println("教龄："+teacherAge+"年");
    }
}
