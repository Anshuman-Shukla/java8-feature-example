package com.functional.funtionalInterfaces;

import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String,Integer> returnLength=x->x.length();
        System.out.println(returnLength.apply("jhjhjjj"));
    }
}
