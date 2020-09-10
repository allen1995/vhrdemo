package com.allen.vhr.entity;

import java.io.Serializable;

/**
 * (Empsalary)实体类
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
public class Empsalary implements Serializable {
    private static final long serialVersionUID = 611398757012887938L;
    
    private Integer id;
    
    private Integer eid;
    
    private Integer sid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

}