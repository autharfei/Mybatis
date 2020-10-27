package com.qf.fei.entity;

import java.io.Serializable;

public class GowRegion implements Serializable {
    /**
     *地区编号
     */
    private Short regionId;

    /**
     *省份编号
     */
    private Short parentId;

    /**
     *地区名字
     */
    private String regionName;

    /**
     *地区类型 1代表省  2代表市  3代表区
     */
    private Boolean regionType;

    /**
     *  状态码默认为0
     */
    private Short agencyId;

    private static final long serialVersionUID = 1L;

    public Short getRegionId() {
        return regionId;
    }

    public void setRegionId(Short regionId) {
        this.regionId = regionId;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Boolean getRegionType() {
        return regionType;
    }

    public void setRegionType(Boolean regionType) {
        this.regionType = regionType;
    }

    public Short getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Short agencyId) {
        this.agencyId = agencyId;
    }
}

