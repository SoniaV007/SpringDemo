package net.javaguides.springboot.controller;

import net.javaguides.springboot.beans.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentPathVariableController {
    @GetMapping("student/{f}/{l}/")
    public Student changename(@PathVariable("f") String firstname, @PathVariable("l") String lastname){
        return new Student(firstname,lastname);
    }
}
