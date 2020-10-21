package com.kgc.qn2;

public class TestStudentAndTeacher {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "子健";
        student.age = 18;
        student.className = "JAVA71";
        student.hobby = "王者荣耀";
        student.showInfo();

        System.out.println("************************");
        Teacher teacher = new Teacher();
        teacher.name = "王老师";
        teacher.major = "王者教学";
        teacher.subject = "打野";
        teacher.teacherAge = 2;
        teacher.showInfo();

    }
}
