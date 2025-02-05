package com.arrays;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}

public class CustomCompareToExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 25));
        students.add(new Student("Charlie", 20));

        Collections.sort(students); // Uses compareTo() to sort by age

        System.out.println("Sorted Students: " + students);
    }
}
