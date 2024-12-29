package com.example.restapi.Restapipractice.Service;

import java.util.List;

import com.example.restapi.Restapipractice.Entities.Course;

public interface CourseService {
    public List<Course> getcourses();

    public Course getcourse(int i);
    public Course addcourse(Course course);

}
