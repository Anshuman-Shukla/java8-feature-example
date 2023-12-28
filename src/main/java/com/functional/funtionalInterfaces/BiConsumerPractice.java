package com.functional.funtionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerPractice {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer=(a,b)-> System.out.println(a.length()+b);
        biConsumer.accept("helelelele",10);
    }
}
