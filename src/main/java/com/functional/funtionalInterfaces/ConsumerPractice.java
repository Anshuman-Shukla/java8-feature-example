package com.functional.funtionalInterfaces;

import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        Consumer<String> addvalue= x-> System.out.println(x);
        addvalue.accept("testing");
        addvalue.accept("geeeee");
    }
}
