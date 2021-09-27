package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CourseService {

	List<Courses> getCourses();

	public Courses getCourse(long courseId);
     
	public Courses addCourse(Courses course);

}
