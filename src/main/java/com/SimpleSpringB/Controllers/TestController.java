package com.SimpleSpringB.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.SimpleSpringB.Model.Course;
import com.SimpleSpringB.Model.User;
import com.SimpleSpringB.services.CourseService;

@RestController
public class TestController {
	
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "welcome to courses application";
	} 

	@GetMapping("/courses")
	public List<Course> getCourses(){
		System.out.println(this.courseService.getCourses());
		 return this.courseService.getCourses();
		
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId ) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public void AddCourse(@RequestBody Course course) {
		courseService.add(course);
	}
	
	@GetMapping("/add")
	public void InsertCourse() {
		Course course=new Course();
		course.setId(1089);
		course.setDescription("This is asp.net");
		course.setTitle("asp");
		courseService.add(course);
	}
	
	
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("/about")
	public ModelAndView secondPage() {
		return new ModelAndView("about");
	}
	
	@GetMapping("/form")
		public ModelAndView showForm(Model model)
		{
		User user=new User();
		model.addAttribute(user);
			return new ModelAndView("form");
		}
	
	@PostMapping("/success")
	public ModelAndView submitForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		return  new ModelAndView("success");
	}
	
	}



