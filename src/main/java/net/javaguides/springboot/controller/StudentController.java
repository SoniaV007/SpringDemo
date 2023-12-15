package net.javaguides.springboot.controller;

import net.javaguides.springboot.beans.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/get")
    public Student getStudent(){
        return new Student("Karan","sharma");
    }
}
