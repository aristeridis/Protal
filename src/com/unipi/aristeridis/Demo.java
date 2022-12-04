package com.unipi.aristeridis;

public class Demo {
    public static void main(String[] args) {
SomeObject som1=new SomeObject();
    giveMeFuncionality(som1);
    SomeObjectChild somc1=new SomeObjectChild();
    giveMeFuncionality(somc1);
    }
    static void giveMeFuncionality(SomeObject so){
        so.sayHello();

    }
}
