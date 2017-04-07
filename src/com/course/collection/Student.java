package com.course.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Charles.Qiu on 2017/4/4.
 */
public class Student implements Comparable<Student> {

    private String id;
    private String name;

    private Set<Course> courses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }


    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
