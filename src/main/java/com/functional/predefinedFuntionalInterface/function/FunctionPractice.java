package com.functional.predefinedFuntionalInterface.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        List<String> list = List.of("kit", "kat", "shake");
        Function<String,Integer> function = String::length;
        List<Integer> newlist = map(list, function);
        System.out.println(newlist);
    }

    private static <T,R> List<R> map(List<T> list, Function<T, R> function) {
        ArrayList<R> newList = new ArrayList<>();
        for(T t:list){
            newList.add(function.apply(t));
        }
        return newList;
    }
}
