package com.functional.data;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Education {

    private int id;
    private String college;
    private  Integer totalMarks;
    private  String stream;
}
