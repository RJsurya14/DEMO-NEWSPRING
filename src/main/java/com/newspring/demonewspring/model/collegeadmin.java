package com.newspring.demonewspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class collegeadmin {

    @Id

    private String username;
    private String address;
    private String email;
    private String fathername;
    private String mothername;
    private int phone;
    private String gender;
    private String trans;
    private float mark;
    private float mark1;
    private String group;

    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    private String group1;
    private String schoolname;
    private String schoolname1;
    private String specialization;
    private int totalfee;
    private int totalfee1;


    public collegeadmin() {
    }


    public collegeadmin(String username, String address, String email, String fathername, String mothername, int phone,
            String trans, float mark, float mark1, String group, String group1, String schoolname, String schoolname1,
            String specialization, int totalfee, int totalfee1,String gender) {
        this.username = username;
        this.address = address;
        this.email = email;
        this.fathername = fathername;
        this.mothername = mothername;
        this.phone = phone;
        this.trans = trans;
        this.mark = mark;
        this.mark1 = mark1;
        this.group = group;
        this.group1 = group1;
        this.schoolname = schoolname;
        this.schoolname1 = schoolname1;
        this.specialization = specialization;
        this.totalfee = totalfee;
        this.totalfee1 = totalfee1;
        this.gender = gender;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getFathername() {
        return fathername;
    }


    public void setFathername(String fathername) {
        this.fathername = fathername;
    }


    public String getMothername() {
        return mothername;
    }


    public void setMothername(String mothername) {
        this.mothername = mothername;
    }


    public int getPhone() {
        return phone;
    }


    public void setPhone(int phone) {
        this.phone = phone;
    }


    public String getTrans() {
        return trans;
    }


    public void setTrans(String trans) {
        this.trans = trans;
    }


    public float getMark() {
        return mark;
    }


    public void setMark(float mark) {
        this.mark = mark;
    }


    public float getMark1() {
        return mark1;
    }


    public void setMark1(float mark1) {
        this.mark1 = mark1;
    }


    public String getGroup() {
        return group;
    }


    public void setGroup(String group) {
        this.group = group;
    }


    public String getGroup1() {
        return group1;
    }


    public void setGroup1(String group1) {
        this.group1 = group1;
    }


    public String getSchoolname() {
        return schoolname;
    }


    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }


    public String getSchoolname1() {
        return schoolname1;
    }


    public void setSchoolname1(String schoolname1) {
        this.schoolname1 = schoolname1;
    }


    public String getSpecialization() {
        return specialization;
    }


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public int getTotalfee() {
        return totalfee;
    }


    public void setTotalfee(int totalfee) {
        this.totalfee = totalfee;
    }


    public int getTotalfee1() {
        return totalfee1;
    }


    public void setTotalfee1(int totalfee1) {
        this.totalfee1 = totalfee1;
    }

    
}