package com.example.baitapquatrinh.BaiTap4.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class OcdDivisionCountryUs {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("officeIndices")
    @Expose
    private List<Integer> officeIndices = null;

    public OcdDivisionCountryUs(String name, List<Integer> officeIndices) {
        this.name = name;
        this.officeIndices = officeIndices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OcdDivisionCountryUs withName(String name) {
        this.name = name;
        return this;
    }

    public List<Integer> getOfficeIndices() {
        return officeIndices;
    }

    public void setOfficeIndices(List<Integer> officeIndices) {
        this.officeIndices = officeIndices;
    }

    public OcdDivisionCountryUs withOfficeIndices(List<Integer> officeIndices) {
        this.officeIndices = officeIndices;
        return this;
    }

}