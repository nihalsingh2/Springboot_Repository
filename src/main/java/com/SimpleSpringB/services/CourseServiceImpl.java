package com.SimpleSpringB.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimpleSpringB.Dao.CourseRepository;

import com.SimpleSpringB.Entities.CourseEntity;
import com.SimpleSpringB.Model.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	
@Autowired
 CourseRepository cr;
	
	List <Course> list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"java","java description"));
		list.add(new Course(132,"spring","spring description"));
	}
	
	@Override
	public List<Course> getCourses(){
		return list;
	}
	
	@Override
	public Course getCourse(Long courseId) {
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public void add(Course course) {
		CourseEntity entity=new CourseEntity();
			entity.setId(course.getId());
			entity.setDescription(course.getDescription());
			entity.setTitle(course.getTitle());
			cr.save(entity);
		
	}


}
