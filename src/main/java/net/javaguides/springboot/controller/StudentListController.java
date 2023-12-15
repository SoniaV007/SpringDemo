package net.javaguides.springboot.controller;

import net.javaguides.springboot.beans.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentListController {
    @GetMapping("/getlist")
    public List<Student> returnList(){
        Student s1 = new Student("hihi","hha");
        Student s2 = new Student("hih454i","h454ha");
        List<Student> L1 = new ArrayList<>();
        L1.add(s1);
        L1.add(s2);
        return L1;
    }
}
