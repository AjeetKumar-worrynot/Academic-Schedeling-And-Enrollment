package com.example.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.model.Course;
import com.example.project1.model.CourseRegistry;
import com.example.project1.service.Courseservice;




@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501/")
public class Coursecontroller {
    @Autowired
    Courseservice courseServices;

@GetMapping("courses")
 public List <Course> availablecourses (){
     return courseServices.availablecourses();
    

 }
@GetMapping("courses/enrolled")
public List<CourseRegistry> enrolledStudents(){
    return courseServices.enrolledstudents();

}
@PostMapping("/courses/register")
public String enrollcourse(@RequestParam("name") String name,
                        @RequestParam("emailId") String emailId,
                         @RequestParam("courseName") String courseName){
                    courseServices.enrollcourse(name,emailId,courseName);
                    return "congratulation!"+name+"Enrolled sucessfully"+courseName;

}
}
