package com.example.project1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private String CourseId;
    private String courseName;
    private String trainer;
    public String getCourseId() {
        return CourseId;
    }
    public void setCourseId(String courseId) {
        CourseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String couseName) {
        this.courseName = couseName;
    }
    public String getTrainer() {
        return trainer;
    }
    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
    public int getDurationInWeeks() {
        return durationInWeeks;
    }
    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }
    private int durationInWeeks;

}
