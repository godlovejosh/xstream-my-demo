package com.thoughtworks.xstream.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuxing
 */
public class News {

    private List<School> schools = new ArrayList<>();

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }
}
