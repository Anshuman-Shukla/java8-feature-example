package com.functional.optional;

import java.util.Optional;

public class OptionalGetValuePractice {
    public static void main(String[] args) {
        Integer a =100;
        Integer b = 200;
        //Declartion
        Optional<Integer> integer = Optional.of(a);

        Optional<Object> emptyOptional = Optional.empty();

        Optional<Integer> optionalNullable = Optional.ofNullable(b);

        System.out.println(integer.get());

        System.out.println(emptyOptional.isPresent()?emptyOptional.get():"value not present");

        System.out.println(optionalNullable.isPresent()?optionalNullable.get():"value not present");
        //.orElse()
        System.out.println(emptyOptional.orElse(89));
        //.orElseGet()
        System.out.println(emptyOptional.orElseGet(()->"Optional is not present"));
        //.orElseThrow()
       // System.out.println(emptyOptional.orElseThrow());
        //.orElseThrow()
        System.out.println(emptyOptional.orElseThrow(()->new IllegalArgumentException("Custome Exception")));


    }
}
