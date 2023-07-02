package com.springboot.jpahibernate.course.jpa;

import com.springboot.jpahibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course newCourse) {
        entityManager.merge(newCourse);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course courseToDelete = entityManager.find(Course.class, id);
        entityManager.remove(courseToDelete);
    }
}
