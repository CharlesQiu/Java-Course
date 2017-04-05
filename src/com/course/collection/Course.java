package com.course.collection;

/**
 * Created by Charles.Qiu on 2017/4/4.
 */
public class Course {

    private String id;
    private String name;

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

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course() {
    }
}
