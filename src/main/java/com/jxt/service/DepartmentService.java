package com.jxt.service;

import com.jxt.pojo.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartments();

    Department getDepartmentById(Integer id);
}
