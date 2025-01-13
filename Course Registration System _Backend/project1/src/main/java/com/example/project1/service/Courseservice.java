package com.example.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.project1.Repository.CourseRegistryRepo;
import com.example.project1.Repository.CourseRepo;
import com.example.project1.model.Course;
import com.example.project1.model.CourseRegistry;

@Service
public class Courseservice {
    @Autowired
    CourseRepo courseRepos;

    @Autowired
        CourseRegistryRepo courseRegistryRepo;
       
        
            public List<Course> availablecourses(){
                return courseRepos.findAll();
        
            }
            public List<CourseRegistry>enrolledstudents(){
                return courseRegistryRepo.findAll();
            }
            public void enrollcourse(String name,String emailId,String courseName){
                CourseRegistry courseRegistry=new CourseRegistry(name,emailId,courseName);
                courseRegistryRepo.save(courseRegistry);
            }

}
