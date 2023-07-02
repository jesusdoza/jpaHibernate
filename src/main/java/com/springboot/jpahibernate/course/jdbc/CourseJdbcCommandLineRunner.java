package com.springboot.jpahibernate.course.jdbc;

import com.springboot.jpahibernate.course.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    private CourseJdbcRepository repository;

    public CourseJdbcCommandLineRunner(CourseJdbcRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.insert(new Course(10, "new course for test template", "joe"));
        repository.insert(new Course(102, "TOM DID THIS", "tom"));
        repository.insert(new Course(103, "TOM DID THIS again", "tom"));

        repository.deleteById(102);

        System.out.println(repository.findById(10));
        System.out.println(repository.findById(103));


    }
}
