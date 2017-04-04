package com.course.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Charles.Qiu on 2017/4/4.
 */
public class ListTest {

    // 用于存放备选课程的List
    private List coursesToSelect;

    /**
     * Gets courses to select.
     *
     * @return the courses to select
     */
    public List getCoursesToSelect() {
        return coursesToSelect;
    }

    /**
     * Sets courses to select.
     *
     * @param coursesToSelect the courses to select
     */
    public void setCoursesToSelect(List coursesToSelect) {
        this.coursesToSelect = coursesToSelect;
    }

    /**
     * Instantiates a new List test.
     */
    public ListTest() {
        this.coursesToSelect = new ArrayList();
    }

    /**
     * 测试数组中增加元素
     */
    public void testAdd() {
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

    }

    /**
     * Test get.
     */
    public void testGet() {
        int size = coursesToSelect.size();
        System.out.println("通过 for each 遍历 ===");
        for (Object value : coursesToSelect) {
            Course cr = (Course)value;
            System.out.println("课程 " + cr.getId() + ":" + cr.getName());
        }
    }

    public void testMove() {
        
    }

    /**
     * 迭代器遍历数组
     */
    public void testIterator() {
        Iterator it = coursesToSelect.iterator();
        System.out.println("通过迭代器遍历数组 ---");
        while (it.hasNext()) {
            Course cr = (Course)it.next();
            System.out.println("课程 " + cr.getId() + ":" + cr.getName());
        }
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testGet();
        lt.testIterator();
    }
}
