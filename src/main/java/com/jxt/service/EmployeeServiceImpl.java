package com.jxt.service;

import com.jxt.dao.EmployeeMapper;
import com.jxt.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getEmployees() {
        return employeeMapper.getEmployees();
    }

    @Override
    public int update(Employee employee) {
        return employeeMapper.update(employee);
    }


    @Override
    public int save(Employee employee) {
        return employeeMapper.save(employee);
    }

    @Override
    public Employee get(Integer id) {
        return employeeMapper.get(id);
    }

    @Override
    public int delete(Integer id) {
        return employeeMapper.delete(id);
    }
}
