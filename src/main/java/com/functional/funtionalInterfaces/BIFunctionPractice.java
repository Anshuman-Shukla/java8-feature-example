package com.functional.funtionalInterfaces;

import java.util.function.BiFunction;

public class BIFunctionPractice {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction= (a,b)->a+b;
        System.out.println(biFunction.apply("hello"," world"));
    }
}
