package com.jxt.controller;

import com.jxt.pojo.Department;
import com.jxt.pojo.Employee;
import com.jxt.service.DepartmentServiceImpl;
import com.jxt.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
    @Autowired
    private DepartmentServiceImpl departmentService;
    @RequestMapping("/list")
    public String allEmployees(Model model){

        List<Employee> employees = employeeService.getEmployees();
        model.addAttribute("emps",employees);

        return "employee/list";
    }
    @RequestMapping("/toAdd")
    public String toAddPage(Model model){
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("department",departments);
        return "employee/add";
    }
    @RequestMapping("/add")
    public String addEmployee(Employee employee){
//        System.out.println("----------"+employee);
        employeeService.save(employee);


        return "redirect:/employee/list";
    }

    @RequestMapping("/toUpdatePage/{id}")
    public String toUpdateEmployee(@PathVariable("id") Integer id, Model model){

        Employee employeeById = employeeService.get(id);
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("employee",employeeById);
        model.addAttribute("department",departments);
        return "employee/update";
    }
    @RequestMapping("/update")
    public String updateEmployee(Employee employee){
        employeeService.update(employee);

        return "redirect:/employee/list";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id")Integer id){
        employeeService.delete(id);
        return "redirect:/employee/list";
    }
}
