package com.unipi.aristeridis;

import java.util.List;

public class Secretary {
    void printStudentList(List<Student> students){
        for (Student s:students){
            System.out.println(s.name+","+s.am);

        }
    }

}
