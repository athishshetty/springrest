package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;
@Service
public class CourseServiceimpl implements CourseService {

List<Courses> list;
public CourseServiceimpl() {
	list=new ArrayList<>();
	list.add(new Courses(145,"java","Basics"));
	list.add(new Courses(146,"Python","Basics"));
	
	
}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		Courses c=null;
		for(Courses courses:list)
		{
			if(courses.getId()==courseId)
			{
				c=courses;
				break;
			}
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}
	


}
