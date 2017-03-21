package com.thoughtworks.xstream.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuxing
 */
public class Teacher {

    private int id ;
    private String name;
    private  int age;
    private List<Student> students = new ArrayList<Student>();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {

        return this.id+ this.name;
    }
}
