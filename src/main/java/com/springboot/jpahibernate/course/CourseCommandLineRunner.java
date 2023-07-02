package com.springboot.jpahibernate.course;

import com.springboot.jpahibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(10, "JPA new course for test template", "joe"));
        repository.insert(new Course(102, "JPA TOM DID THIS", "tom"));
        repository.insert(new Course(103, "JPA TOM DID THIS again", "tom"));

        repository.deleteById(102);

        System.out.println(repository.findById(10));
        System.out.println(repository.findById(103));


    }
}
