package com.example.demo.entety;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "student")
public class Student {

    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String email;

   // @Field
    //private List<Integer> grades;



}
