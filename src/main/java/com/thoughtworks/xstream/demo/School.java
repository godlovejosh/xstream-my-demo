package com.thoughtworks.xstream.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuxing
 */
public class School {

    private int id;
    private String name;
    private String address;
    private List<Teacher> teachers= new ArrayList<>();
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    @Override
    public String toString() {

        return  this.id + this.name;
    }
}
