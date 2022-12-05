package com.unipi.aristeridis;

public interface MyInterface {
    void doSomething();
    default int add2Numbers(int a,int b){
        return a+b;
    }
    static void helperStaticMethod(){
        System.out.println("Give some Help");
    }
}
