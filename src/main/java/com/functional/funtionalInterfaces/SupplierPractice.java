package com.functional.funtionalInterfaces;

import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {
        Supplier<Double> giveRandomNumber= ()->Math.random()*100;
        System.out.println(giveRandomNumber.get());
    }
}
