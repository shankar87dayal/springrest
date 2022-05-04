package com.springrest.springrest.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(14, "core java courese", "this course is related to java"));
//		list.add(new Course(15, "spring boot course", "this course is related to spring boot"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
//		return list;
	}

	@Override
	public Course getCourse(long courseId) {
//		
//		Course c = null;
//		 for(Course course : list)
//		 {
//			 if(course.getId()== courseId)
//			 {
//				 c=course;
//					break;
//			 }
//		 }
//		return c;
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;

		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		
//		list.forEach(e -> {
//			if(e.getId()==course.getId()) {
//				e.setDescription(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
//
//		this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
 
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
		
	}

}




