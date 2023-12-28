package com.functional.data;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

    private int id;
    private  String name;
    private  String city;
    private String state;
   private  Education education;
}
