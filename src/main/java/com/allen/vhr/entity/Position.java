package com.allen.vhr.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Position)实体类
 *
 * @author makejava
 * @since 2020-09-10 16:29:25
 */
public class Position implements Serializable {
    private static final long serialVersionUID = -73335096215396502L;
    
    private Integer id;
    /**
    * 职位
    */
    private String name;
    
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