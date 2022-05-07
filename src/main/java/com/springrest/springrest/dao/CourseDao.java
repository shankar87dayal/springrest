package com.springrest.springrest.dao;

//commit 2

//commit 1

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
