package com.functional.streams;

import com.functional.ExampleForPractice.ExampleForPractice;
import com.functional.data.Person;

import java.util.*;
import java.util.stream.Collectors;


public class StreamApiExample {
    public static List<Integer> getListOfInteger() {
    return Arrays.asList(2,4,32,35,22,6,5,344,87,8,5,43,3,33,445,44,66,77,5454,343,22,3,8,88,9,9655);
    }
public static List<Person> getPersonList(){
        List<Person> personList= new ArrayList<>();
        personList.add(new Person(1,"anshu","Gorakhpur","UP",null));
        personList.add(new Person(2,"Rahul","Gorakhpur","UP",null));
        personList.add(new Person(3,"Rohit","Gorakhpur","UP",null));
        personList.add(new Person(4,"Rashu","Basti","MP",null));
        personList.add(new Person(5,"Shweta","Basti","Bihar",null));
        personList.add(new Person(6,"Ashish","Lucknow","Delhi",null));
        personList.add(new Person(7,"baby","Agra","Assam",null));
        personList.add(new Person(8,"Smita","Agra","Haryana",null));
        return  personList;
}
    public static void main(String[] args) {
       /* List<Person> person = ExampleForPractice.getPerson();
        person.stream().map(p -> p.getName()).forEach(System.out::println);*/

        /*String str="anaskhsjdsdasdjakshdkajs";
        Map<String, Long> collect = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);
        System.out.println("**********************************");

        Map<String, Long> collection2 = collect.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        System.out.println(collection2);
        System.out.println("**********************************");*/

        /*List<Integer> integerList = getListOfInteger().stream().filter(x -> x%2== 0).collect(Collectors.toList());
        System.out.println(integerList);*/

        /*List<Person> collect = getPersonList().stream().sorted((a, b) -> b.getId() - a.getId()).collect(Collectors.toList());
        */
        //List<String> collect = getPersonList().stream().map(e -> e.getName()).collect(Collectors.toList());

        Map<String, List<Person>> collect = getPersonList().stream().collect(Collectors.groupingBy(Person::getCity));

        System.out.println(collect);

    }
}
