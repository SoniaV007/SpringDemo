package net.javaguides.springboot.controller;

import net.javaguides.springboot.beans.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentQueryParamter {
    @GetMapping("/student/query")
    public Student query(@RequestParam(name="ff")String f, @RequestParam(name="lf")String l){
        return new Student(f,l);
    }
}
