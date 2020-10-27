package com.qf.fei.entity;

import java.io.Serializable;
import java.util.List;

public class User2 implements Serializable {
    /**
     *
     */
    private Integer Id;

    /**
     *
     */
    private String Name;

    /**
     *
     */
    private String Phone;

    /**
     *
     */
    private String Address;

    /**
     *
     */
    private String Detail;

    private List<GowRegion> gowRegions;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String uDetail) {
        this.Detail = uDetail;
    }
}

