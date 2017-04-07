package com.course.collection;

import java.util.Comparator;

/**
 * Created by Charles.Qiu on 2017/4/7.
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
