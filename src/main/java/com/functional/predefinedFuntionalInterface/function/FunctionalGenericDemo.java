package com.functional.predefinedFuntionalInterface.function;

public class FunctionalGenericDemo {
    public static void main(String[] args) {

        FunctionalGenerics<String,String> fun=s -> s.substring(1,5);
        System.out.println(fun.execute("Anshuman Shukla"));

        FunctionalGenerics<String,Integer> functionalGenerics= s->s.length();
        System.out.println(functionalGenerics.execute("Hello World"));
    }
}
