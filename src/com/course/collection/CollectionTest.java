package com.course.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Charles.Qiu on 2017/4/7.
 */
public class CollectionTest {

    public void testSort1() {
        List<Integer> intList = new ArrayList<>();
        Random random = new Random();
        Integer k;
        for (int i = 0; i < 10; i++) {
            do {
                k = random.nextInt(100);
            } while (intList.contains(k));
            intList.add(k);
            System.out.println("成功添加整数：" + k);
        }
        System.out.println("-----------排序前-------------");
        for (Integer integer : intList) {
            System.out.println("元素：" + integer);
        }
        Collections.sort(intList);
        System.out.println("-----------排序后-------------");
        for (Integer integer : intList) {
            System.out.println("元素：" + integer);
        }

    }

    public void testSort2() {
        List<String> stringList = new ArrayList<>();
        stringList.add("microsoft");
        stringList.add("google");
        stringList.add("apple");
        System.out.println("-----------排序前-------------");
        for (String s : stringList) {
            System.out.println("元素：" + s);
        }
        Collections.sort(stringList);
        System.out.println("-----------排序后-------------");
        for (String s : stringList) {
            System.out.println("元素：" + s);
        }
    }

    public void testSort3() {
        List<Student> stus = new ArrayList<>();
        Random random = new Random();

        stus.add(new Student(random.nextInt(1000) + "", "Annie"));
        stus.add(new Student(random.nextInt(1000) + "", "Lucy"));
        stus.add(new Student(random.nextInt(1000) + "", "Lily"));
        stus.add(new Student("10000" + "", "John"));
        System.out.println("-----------排序前-------------");
        for (Student s : stus) {
            System.out.println("元素：" + s.getId() + ":" + s.getName());
        }
        Collections.sort(stus);
        System.out.println("-----------排序后-------------");
        for (Student s : stus) {
            System.out.println("元素：" + s.getId() + ":" + s.getName());
        }
        System.out.println("-----------按照姓名排序后-------------");
        Collections.sort(stus, new StudentComparator());
        for (Student s : stus) {
            System.out.println("元素：" + s.getId() + ":" + s.getName());
        }
    }

    public static void main(String[] args) {
        CollectionTest t = new CollectionTest();
//        t.testSort1();
//        t.testSort2();
        t.testSort3();
    }
}
