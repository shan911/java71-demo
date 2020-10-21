package com.kgc.qn1;

public class TestPerson {
    public static void main(String[] args) {
        //创建对象  new 对象
        // 语法： 类名 对象名 = new 类名();
        Person p = new Person();
        //引用（调用）类的属性
        p.name = "张三";
        p.sex = '男';
        p.age = 20 ;

        //引用（调用）类的方法
        p.eat();
        p.drink();
        p.showInfo();
        System.out.println("**************");
        p.zuoxi();
        System.out.println("**************");
        String name = p.getName();
        System.out.println(name);




    }
}
