package com.example.telecom.paris.services.processor;

import com.example.telecom.paris.models.Student;

public class Processor {
    public static void main(String[] args) {
        Student student = new Student(1024, "Patrick", "Bellot");
        System.out.println(student);
    }
}