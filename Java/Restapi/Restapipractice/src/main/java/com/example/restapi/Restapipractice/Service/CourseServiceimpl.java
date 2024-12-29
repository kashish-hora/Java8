package com.example.restapi.Restapipractice.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restapi.Restapipractice.Entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

    List<Course> list;
    public CourseServiceimpl(){
list=new ArrayList<>();
list.add(new Course(123,"java course"));
list.add(new Course(145,"python course"));


    }
    @Override
    public List<Course> getcourses() {
        // TODO Auto-generated method stub
        return list;
        
    }
    @Override
    public Course getcourse(int i) {
        // TODO Auto-generated method stub
        Course c=null;
        for(Course course:list){
            if(course.getId()==i){
                c=course;
                break;
            }
        }
        return c;
    }
    @Override
    public Course addcourse(Course course) {
        // TODO Auto-generated method stub
        list.add(course);
        return course;
       
    }
   

    
}
