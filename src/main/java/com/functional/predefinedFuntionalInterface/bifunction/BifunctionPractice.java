package com.functional.predefinedFuntionalInterface.bifunction;

import java.util.function.BiFunction;

public class BifunctionPractice {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> biFunction = (a,b)->(a+b).length();
        System.out.println(biFunction.apply("hello","world"));
    }
}
