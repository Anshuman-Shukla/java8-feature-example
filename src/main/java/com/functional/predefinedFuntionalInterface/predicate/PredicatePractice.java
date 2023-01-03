package com.functional.predefinedFuntionalInterface.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 *
 */
public class PredicatePractice {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Anshuman","","shukla","Shweta","","Rashu","AnshumanRashu");
        Predicate<String> predicate = s -> !s.isEmpty();
       List<String> newlist = filterlist(list,predicate);
        System.out.println(newlist);
        Predicate<String> containsPredicate= s -> s.contains("nshu");
        System.out.println(filterlist(list,containsPredicate));
    }

    private static List<String> filterlist(List<String> list, Predicate<String> predicate) {
        List<String> finalList = new ArrayList<>();
        for (String str: list){
            if(predicate.test(str))
                finalList.add(str);
        }
        return finalList;
    }
}
