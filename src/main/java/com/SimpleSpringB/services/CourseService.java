package com.SimpleSpringB.services;

import java.util.List;

import com.SimpleSpringB.Model.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(Long courseId);
	public void add(Course course);

}
