package com.thoughtworks.xstream.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wuxing
 */
@XStreamAlias("RateLadders")
public class RateLadders {

    private static final long serialVersionUID = -9165239636006740390L;

    @XStreamAsAttribute
    private String ladderAccumulativeMaster;
    @XStreamImplicit
    private List<Student> students;

}
