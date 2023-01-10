package com.functional.predefinedFuntionalInterface.supplier;

import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = ()->new String("String from Supplier");
        System.out.println(stringSupplier.get());
        Supplier<Double> randomSupplier= ()->Math.random();
        System.out.println(randomSupplier.get());
    }
}
