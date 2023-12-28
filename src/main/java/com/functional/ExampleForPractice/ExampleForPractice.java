package com.functional.ExampleForPractice;

import com.functional.data.Education;
import com.functional.data.Person;

import java.util.ArrayList;
import java.util.List;

public class ExampleForPractice {
    private static List<Person> person = new ArrayList<>();

    static {
        person.add(new Person(1, "Anshuman", "Gorakhpur", "U.P",
                new Education(121, "Kurukshetra", 223, "PCM")));
        person.add(new Person(1, "Rahul", "Basti", "U.P",
                new Education(121, "AKTU", 444, "PCB")));
        person.add(new Person(1, "Rashu", "Lucknow", "U.P",
                new Education(121, "GBTU", 888, "Science")));
        person.add(new Person(1, "Roshni", "Noida", "Noida",
                new Education(121, "MKTU", 555, "Commerce")));
        person.add(new Person(1, "Rohit", "Siddhartnagar", "U.P",
                new Education(121, "AKTU", 223, "Bio")));

    }
    public static List<Person> getPerson(){
        return person;
    }
}
