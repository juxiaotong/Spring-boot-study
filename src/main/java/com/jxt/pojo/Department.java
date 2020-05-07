package com.jxt.pojo;


import org.apache.ibatis.type.Alias;

public class Department {
    private String name;
    private Integer id;

    public Department() {
    }
    public Department(Integer id){
        this.id = id;
    }

    public Department(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
