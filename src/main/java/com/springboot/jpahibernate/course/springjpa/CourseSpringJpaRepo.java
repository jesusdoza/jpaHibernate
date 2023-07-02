package com.springboot.jpahibernate.course.springjpa;

import com.springboot.jpahibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringJpaRepo extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);


}
