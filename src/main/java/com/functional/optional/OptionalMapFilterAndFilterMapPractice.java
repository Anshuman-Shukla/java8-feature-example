package com.functional.optional;

import java.util.Optional;

public class OptionalMapFilterAndFilterMapPractice {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Anshuman");
        Optional<String> map = optional.map(value -> " Changed to Anshuman Shukla");
        System.out.println(map.get());

        Optional<String> filter = optional.filter(value -> value.contains("Ansh"));
        System.out.println(filter.orElse("Optional does not match the filter condition"));

        Optional<String> flatmap = optional.flatMap(value -> Optional.of("Replaced value"));
        System.out.println(flatmap.get());

        optional.ifPresent(value->System.out.println(value));

        Optional.empty().ifPresentOrElse(value-> System.out.println(value),()-> System.out.println("Value is not present usingPresentOrElse"));
    }
}
