package com.unipi.aristeridis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List <Student> students=new ArrayList<>();
    public static void main(String[] args) {
        Student s1=new Student();
        s1.am="mpsp2205";
        s1.name="Alexandros";
        Student s2=new Student();
        s2.am="mpsp2206";
        s2.name="Alexandra";
        students.add(s1);
        students.add(s2);
        Secretary katerina=new Secretary();
        katerina.printStudentList(students);


    }
}