package com.thoughtworks.xstream.demo;

import com.thoughtworks.xstream.XStream;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author wuxing
 */
public class ParseDemo {

    public static void main(String[] args) throws IOException {
        demo01();
        demo02();
    }

    public static void demo01() throws IOException {
        InputStream xmlInputStream = new ClassPathResource("admin.xml").getInputStream();
        XStream xStream = new XStream();
        xStream.alias("AdminUser", AdminUser.class);
        xStream.alias("ConfigUser", ConfigUsers.class);
        ConfigUsers users = (ConfigUsers) xStream.fromXML(xmlInputStream);
        List<AdminUser> adminUsers = users.getUsers();
    }

    public static void demo02() throws IOException {
        InputStream xmlInputStream = new ClassPathResource("admin2.xml").getInputStream();
        XStream xStream = new XStream();
        xStream.alias("AdminUser", AdminUser.class);
        xStream.alias("ConfigUser", ConfigUsers.class);
        ConfigUsers users = (ConfigUsers) xStream.fromXML(xmlInputStream);
        List<AdminUser> adminUsers = users.getUsers();
        if (null == adminUsers) {
            System.out.println("ok");
        }
    }
}
