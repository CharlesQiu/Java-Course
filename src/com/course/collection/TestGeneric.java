package com.course.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charles.Qiu on 2017/4/4.
 */
public class TestGeneric {

    public List<Course> crs;

    public TestGeneric() {
        this.crs = new ArrayList<Course>();
    }

    public void testAdd() {
        Course cr0 = new Course("1", "大学语文");
        crs.add(cr0);
    }

    public void testForEach() {
        for (Course course : crs) {
            System.out.println("ID:" + course.getId() + " Name:" + course.getName());
        }
    }

    public static void main(String[] args) {
        TestGeneric t = new TestGeneric();
        t.testAdd();
        t.testForEach();
    }
}
