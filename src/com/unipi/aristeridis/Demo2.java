package com.unipi.aristeridis;

import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleInt=v ->2*v;
        System.out.println("r"+doubleInt.apply(5));
    }
}
