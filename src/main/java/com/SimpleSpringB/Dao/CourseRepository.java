package com.SimpleSpringB.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.SimpleSpringB.Entities.CourseEntity;
import com.SimpleSpringB.Model.Course;
import com.SimpleSpringB.Model.User;

public interface CourseRepository extends CrudRepository<CourseEntity,Integer>{
	
	
}
