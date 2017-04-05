package com.course.collection;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Charles.Qiu on 2017/4/5.
 */
public class SetTest {

    private List<Course> coursesToSelect = new ArrayList<Course>();

    public List<Course> getCoursesToSelect() {
        return coursesToSelect;
    }

    public void setCoursesToSelect(List<Course> coursesToSelect) {
        this.coursesToSelect = coursesToSelect;
    }

    /**
     * 测试数组中增加元素
     */
    public void testAdd() {
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(cr2);
        Course[] course = {
                new Course("3", "离散数学"),
                new Course("4", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));

        Course[] course2 = {
                new Course("5", "高等数学"),
                new Course("6", "大学英语")};
        coursesToSelect.addAll(Arrays.asList(course2));
    }

    public void forEach() {
        System.out.println("有如下课程可选：");
        for (Course course : coursesToSelect) {
            System.out.println("ID：" + course.getId() + " " + "Name：" + course.getName());
        }
    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.forEach();

        Student student = new Student("1", "小明");
        Set<Course> tempSet = new HashSet<Course>();
        System.out.println("欢迎学生：" + student.getName() + "选课！");
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入课程ID：");
            String courseId = console.next();
            for (Course course : st.coursesToSelect) {
                if (course.getId().equals(courseId)) {
                    tempSet.add(course);
                    break;
                } else {
                    System.out.println("不存在课程ID为：" + courseId + " 的课程");
                }
            }
            student.setCourses(tempSet);
        }

        for (Course course : student.getCourses()) {
            System.out.println("选择了课程：" + course.getId() + ":" + course.getName());
        }
    }
}
