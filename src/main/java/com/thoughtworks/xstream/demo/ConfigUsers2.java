package com.thoughtworks.xstream.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * @author wuxing
 */
@XStreamAlias("ConfigUsers")
public class ConfigUsers2 {

    @XStreamAsAttribute
    private String type;
    @XStreamImplicit
    private List<AdminUser> users;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<AdminUser> getUsers() {
        return users;
    }

    public void setUsers(List<AdminUser> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("type", type)
                .append("users", users)
                .toString();
    }
}
