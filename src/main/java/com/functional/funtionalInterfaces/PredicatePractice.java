package com.functional.funtionalInterfaces;

import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {
        Predicate<String> checklength= x->x.length()>6;
        System.out.println(checklength.test("hhheddd"));
    }
}
