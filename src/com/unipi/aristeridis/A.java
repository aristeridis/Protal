package com.unipi.aristeridis;

public class A implements MyInterface,otherInterface{
    @Override
    public void doSomething() {
        System.out.println("Hi A");

    }

    @Override
    public void speak(String s) {
        System.out.println("String from speak"+s);
    }
}
