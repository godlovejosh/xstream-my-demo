package com.thoughtworks.xstream.demo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuxing
 */
public class BeanToXml {
    public static void main(String[] args) {
        List<Student> stus = new ArrayList<>();
        List<Student> stus1 = new ArrayList<>();
        List<Teacher> teas = new ArrayList<>();
        List<School> schools = new ArrayList<>();
        News new1 = new News();
        new1.setSchools(schools);
        School s1= new School();
        s1.setId(1);
        s1.setName("beijing school");
        s1.setAddress("beijin");
        s1.setTeachers(teas);
        schools.add(s1);

        Teacher t1 = new Teacher();
        t1.setId(1);
        t1.setAge(54);
        t1.setName("zs");
        t1.setStudents(stus);

        Teacher t2 = new Teacher();
        t2.setId(2);
        t2.setAge(52);
        t2.setName("ls");
        t2.setStudents(stus1);

        teas.add(t1);
        teas.add(t2);

        Student st1= new Student();
        st1.setId(1);
        st1.setName("student1");
        Student st2= new Student();
        st2.setId(1);
        st2.setName("student2");
        stus.add(st1);
        stus.add(st2);

        Student st3= new Student();
        st3.setId(3);
        st3.setName("student3");
        Student st4= new Student();
        st4.setId(1);
        st4.setName("student4");
        stus1.add(st3);
        stus1.add(st4);
//     System.out.println(s1.getTeachers().get(0));
        XStream xstream = new XStream(new DomDriver());
        xstream.aliasPackage("","com.test.picc.domain");
        xstream.aliasField("姓名",Student.class, "name");
        String xml = xstream.toXML(new1) ;
//     System.out.println(xml);
        /**
         xstream.alias("com.test.picc.domain.News", News.class);
         xstream.alias("school",School.class);
         xstream.alias("teacher", Teacher.class);
         xstream.alias("student", Student.class);
         *
         */
        String news=  getXml(xml,"News");
        News n1 = (News)xstream.fromXML(news);
        List<School> schools1 = n1.getSchools();
        for(School sch:schools1){
            System.out.println(sch);
            for(Teacher t:sch.getTeachers()){
                System.out.println(t);
            }
        }
        System.out.println();

    }
    /**
     * 获取xml报文
     * @param xml
     * @param node
     * @return
     */
    public static  String getXml(String xml, String node){
        int startBodyValue = xml.indexOf("<" + node + ">");
        if(startBodyValue<0){
            return "";
        }
        if (xml != null && xml.length() > 0) {
            xml = xml.substring(startBodyValue);
        }
        int indexBodyValue = xml.indexOf("</" + node + ">");
        if(indexBodyValue<0){
            return null;
        }
        if (xml != null && xml.length() > 0) {
            xml = xml.substring(0, indexBodyValue);
        }
        xml = xml + "</" + node + ">";
        return xml;
    }
}
