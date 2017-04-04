package com.course.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Charles.Qiu on 2017/4/4.
 */
public class ListTest {

    // 用于存放备选课程的List
    private List coursesToSelect;

    public List getCoursesToSelect() {
        return coursesToSelect;
    }

    public void setCoursesToSelect(List coursesToSelect) {
        this.coursesToSelect = coursesToSelect;
    }

    public ListTest() {
        this.coursesToSelect = new ArrayList();
    }

    public void  testAdd() {
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course)coursesToSelect.get(0);
        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(0, cr2);
        Course temp2 = (Course)coursesToSelect.get(0);

        Course[] course = {
                new Course("3", "离散数学"),
                new Course("4", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));

        Course[] course2 = {
                new Course("5", "高等数学"),
                new Course("6", "大学英语")};
        coursesToSelect.addAll(2, Arrays.asList(course2));

        for (Object value : coursesToSelect) {
            Course tmp = (Course) value;
            System.out.println("课程 " + tmp.getId() + ":" + tmp.getName());
        }
    }

    public void  testGet() {
        int size = coursesToSelect.size();
        System.out.println("有如下课程待选：");
        for (int i = 0; i < size; i++) {
            Course cr = (Course) coursesToSelect.get(i);
            System.out.println("课程 " + cr.getId() + ":" + cr.getName());

        }
    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testGet();

    }
}
