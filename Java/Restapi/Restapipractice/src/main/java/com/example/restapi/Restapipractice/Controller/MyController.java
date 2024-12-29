package com.example.restapi.Restapipractice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.Restapipractice.Entities.Course;
import com.example.restapi.Restapipractice.Service.CourseService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MyController {
    @Autowired
    private CourseService courseservice;
    @GetMapping("/home")
    public String home(){
        return "welcome to application";
    }
    //get the courses
    @GetMapping("/courses")
    public List<Course> getcourses(){
        return this.courseservice.getcourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getcourse(@PathVariable String courseId){
        return this.courseservice.getcourse(Integer.parseInt(courseId));
    }
    @PostMapping("/courses")
    public Course addcourse(@RequestBody Course course) {
        //TODO: process POST request
        
        return this.courseservice.addcourse(course);
    }
    
    }
    

    
    

 

