package com.uam.ejercicios.ejercicio5.models;

import com.uam.ejercicios.ejercicio5.models.Course;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student {
    private String name;
    private String career;
    private int id;
    private Course Course;

    public void displayDetails(){
        System.out.printf("""
                \n===== Student Details =====
                
                Name: %s
                Career: %s
                ID: %d
                Course: %s
                Teacher's Course: %s
                """, this.getName(),
                this.getCareer(),
                this.getId(),
                this.getCourse().getNameCourse(),
                this.getCourse().getTeacherCourse());
    }
}
