package com.functional.predefinedFuntionalInterface.binaryOperator;

import java.util.function.BinaryOperator;

/**
 * Binary function take two argument of same type and returns the same type
 */
public class BinaryOperatorPractice {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (a,b)->a+b;
        System.out.println(binaryOperator.apply("Anshuman"," Shukla"));
    }
}
