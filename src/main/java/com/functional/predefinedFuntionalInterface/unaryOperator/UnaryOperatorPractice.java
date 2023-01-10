package com.functional.predefinedFuntionalInterface.unaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 22, 21, 33, 44);
        UnaryOperator<Integer> operator=integer -> integer*100;
        List<Integer> newList = mapper(list, operator);
        System.out.println(newList);
    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        List<T> newList= new ArrayList<>();
        for(T t:list){
            newList.add(operator.apply(t));
        }
        return newList;
    }
}
