package com.jxt;

import com.alibaba.druid.pool.DruidDataSource;
import com.jxt.pojo.Department;
import com.jxt.pojo.Employee;
import com.jxt.service.DepartmentServiceImpl;
import com.jxt.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class SpringbootStudy2ApplicationTests {
    @Autowired
    DepartmentServiceImpl departmentService;
    @Autowired
    EmployeeServiceImpl employeeService;
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
        List<Department> departments = departmentService.getDepartments();
        for (Department department : departments) {
            System.out.println(department);
        }
        List<Employee> employees = employeeService.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }



}
