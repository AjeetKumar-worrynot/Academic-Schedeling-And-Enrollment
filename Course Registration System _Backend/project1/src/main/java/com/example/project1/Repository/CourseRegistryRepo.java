package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project1.model.CourseRegistry;
@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer>{

}
