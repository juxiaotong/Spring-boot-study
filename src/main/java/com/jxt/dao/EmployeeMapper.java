package com.jxt.dao;

import com.jxt.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    // 获取所有员工信息
    List<Employee> getEmployees();


    // 新增一个员工
    int save(Employee employee);
    //修改
    int update(Employee employee);
    // 通过id获得员工信息
    Employee get(Integer id);

    // 通过id删除员工
    int delete(Integer id);

}
