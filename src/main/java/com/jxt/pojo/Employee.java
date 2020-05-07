package com.jxt.pojo;



import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer department;
    private Date birthday;
    private Department eDepartment;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer gender, Integer department, Department edepartment, Date birthday) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.eDepartment = edepartment;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Department getEdepartment() {
        return eDepartment;
    }

    public void setEdepartment(Department edepartment) {
        this.eDepartment = edepartment;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", department=" + department +
                ", edepartment=" + eDepartment +
                ", birthday=" + birthday +
                '}';
    }
}
