package com.unipi.aristeridis;

public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
    SomeObject som1=new SomeObject();
    giveMeFuncionality(som1);
    SomeObjectChild somc1=new SomeObjectChild();
    giveMeFuncionality(somc1);
    giveMeFuncionality(new SomeObject(){
        @Override
        void sayHello() {
            System.out.println("hi");
        }
    });
    A a1=new A();
    giveMeFuncionalityV2(new A());
    giveMeFuncionalityV2(a1);
    giveMeFuncionalityV3(a1);
    }

    static void giveMeFuncionality(SomeObject so){
        so.sayHello();

    }
    static void giveMeFuncionalityV2(MyInterface m){
        m.doSomething();

    }
    static void giveMeFuncionalityV3(otherInterface s){
        s.speak(" unipi");

    }
}
