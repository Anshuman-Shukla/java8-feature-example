package com.functional.funtionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (a,b)->a.substring(0,3)+b.substring(b.length()-4,b.length()-1);
        System.out.println(binaryOperator.apply("anshuman","shukla"));
    }
}
