package com.functional.funtionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator=x->x.toUpperCase();
        System.out.println(unaryOperator.apply("anshuman"));
    }
}
