package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project1.model.Course;
@Repository

public interface CourseRepo extends JpaRepository<Course,String>{

}


