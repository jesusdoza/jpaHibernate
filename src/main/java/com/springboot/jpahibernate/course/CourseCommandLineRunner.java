package com.springboot.jpahibernate.course;

import com.springboot.jpahibernate.course.springjpa.CourseSpringJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    //    @Autowired
//    private CourseJpaRepository repository;
    @Autowired
    private CourseSpringJpaRepo repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(10, "JPA new course for test template", "joe"));
        repository.save(new Course(102, "JPA TOM DID THIS", "tom"));
        repository.save(new Course(103, "JPA TOM DID THIS again", "tom"));
        repository.save(new Course(104, "JPA TOM DID THIS again", "tom"));
        repository.save(new Course(105, "JPA TOM DID THIS again", "tom"));

        repository.deleteById(102L);

        System.out.println(repository.findById(10L));
        System.out.println(repository.findById(103L));
        System.out.println(repository.findByAuthor("tom"));
        System.out.println(repository.findByAuthor(""));


    }
}
