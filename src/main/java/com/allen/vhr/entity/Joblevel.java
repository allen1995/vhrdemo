package com.allen.vhr.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Joblevel)实体类
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
public class Joblevel implements Serializable {
    private static final long serialVersionUID = -65951340025055846L;
    
    private Integer id;
    /**
    * 职称名称
    */
    private String name;
    
    private Object titlelevel;
    
    private Date createdate;
    
    private Boolean enabled;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getTitlelevel() {
        return titlelevel;
    }

    public void setTitlelevel(Object titlelevel) {
        this.titlelevel = titlelevel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}