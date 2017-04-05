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

    /**
     * 泛型集合可以添加泛型的子类型的对象实例
     */
    public void testChild() {
        ChildCourse ccr = new ChildCourse();
        ccr.setId("2");
        ccr.setName("子类型的课程对象实例~~~");
        crs.add(ccr);
    }

    /**
     * 泛型不能使用基本类型,要用基本类型的包装类型
     */
    public void testBasicType() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        TestGeneric t = new TestGeneric();
        t.testAdd();
        t.testChild();
        t.testForEach();

        t.testBasicType();
    }
}
