package com.course.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Charles.Qiu on 2017/4/5.
 */
public class MapTest {
    private Map<String, Student> students;

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }

    public MapTest() {
        this.students = new HashMap<String, Student>();
    }

    public void testPut() {
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.print("请输入学生ID：");
            String ID= console.next();
            Student st = students.get(ID);
            if (st == null) {
                System.out.print("请输入学生姓名：");
                String name = console.next();
                Student newStudent = new Student(ID, name);
                students.put(ID, newStudent);
                System.out.println("成功添加学生：" + students.get(ID).getName());
                i ++;
            } else  {
                System.out.println("该学生ID已被占用！");
                continue;
            }
        }
    }

    public void testKeySet() {
        Set<String> keys = students.keySet();
        System.out.println("共有：" + students.size() + "学生");
        for (String stId : keys) {
            Student st = students.get(stId);
            if (st != null) {
                System.out.println("学生：" + st.getName());
            }
        }
    }

    public void testRemove() {

        while (true) {
            System.out.println("请输入要删除的学生ID：");
            Scanner console = new Scanner(System.in);
            String id = console.next();
            Student st = students.get(id);
            if (st == null) {
                System.out.println("该 id 不存在");
                continue;
            }
            students.remove(id);
            System.out.println("成功删除学生：" + st.getName());
            break;
        }
    }

    public void testEntrySet() {
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.println("取得键：" + entry.getKey() + " " + "对应值：" + entry.getValue().getName());
        }
    }

    public void testModify() {
        System.out.println("请输入要修改的学生id：");
        Scanner console = new Scanner(System.in);
        while (true) {
            String stuId = console.next();
            Student student = students.get(stuId);
            if (student == null) {
                System.out.println("该ID不存在！请重新输入！");
                continue;
            }
            System.out.println("当前该学生id所对应的学生为：" + student.getName());
            System.out.println("请输入新的学生姓名：");
            String name = console.next();
            Student newStudent = new Student(stuId, name);
            students.put(stuId, newStudent);
            System.out.println("修改成功！");
            break;
        }
    }

    public static void main(String[] args) {
        MapTest m = new MapTest();
        m.testPut();
        m.testKeySet();
//        m.testRemove();
//        m.testEntrySet();
        m.testModify();
        m.testEntrySet();
    }
}
