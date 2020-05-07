package com.jxt.service;

import com.jxt.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    // 获取所有员工信息
    List<Employee> getEmployees();

    //修改
    int update(Employee employee);

    // 新增一个员工
    int save(Employee employee);

    // 通过id获得员工信息
    Employee get(Integer id);

    // 通过id删除员工
    int delete(Integer id);
}
