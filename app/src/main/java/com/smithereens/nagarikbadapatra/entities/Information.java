package com.smithereens.nagarikbadapatra.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Information {
    @SerializedName("id")
    Integer id;
    @SerializedName("code")
    String code;
    @SerializedName("description")
    String description;
    @SerializedName("reqDocList")
    String reqDocList;
    @SerializedName("time")
    Integer time;
    @SerializedName("timeUnit")
    String timeUnit;
    @SerializedName("cost")
    Long cost;
    @SerializedName("referDepartment")
    String referDepartment;
    @SerializedName("referPerson")
    String referPerson;
    @SerializedName("referPersonContact")
    String referPersonContact;
    @SerializedName("complaintOfficer")
    String complaintOfficer;
    @SerializedName("remarks")
    String remarks;
    @SerializedName("isActive")
    boolean isActive;
    @SerializedName("officeId")
    int officeId;


    public Information() {
    }

    public Information(int id, String code, String description, String reqDocList, int time, String timeUnit, long cost, String referDepartment, String referPerson, String referPersonContact, String complaintOfficer, String remarks, boolean isActive, int officeId) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.reqDocList = reqDocList;
        this.time = time;
        this.timeUnit = timeUnit;
        this.cost = cost;
        this.referDepartment = referDepartment;
        this.referPerson = referPerson;
        this.referPersonContact = referPersonContact;
        this.complaintOfficer = complaintOfficer;
        this.remarks = remarks;
        this.isActive = isActive;
        this.officeId = officeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReqDocList() {
        return reqDocList;
    }

    public void setReqDocList(String reqDocList) {
        this.reqDocList = reqDocList;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getReferDepartment() {
        return referDepartment;
    }

    public void setReferDepartment(String referDepartment) {
        this.referDepartment = referDepartment;
    }

    public String getReferPerson() {
        return referPerson;
    }

    public void setReferPerson(String referPerson) {
        this.referPerson = referPerson;
    }

    public String getReferPersonContact() {
        return referPersonContact;
    }

    public void setReferPersonContact(String referPersonContact) {
        this.referPersonContact = referPersonContact;
    }

    public String getComplaintOfficer() {
        return complaintOfficer;
    }

    public void setComplaintOfficer(String complaintOfficer) {
        this.complaintOfficer = complaintOfficer;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }
}
