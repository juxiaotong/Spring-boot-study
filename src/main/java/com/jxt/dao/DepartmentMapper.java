package com.jxt.dao;

import com.jxt.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;
@Mapper
@Repository
public interface DepartmentMapper {

     List<Department> getDepartments();

     Department getDepartmentById(Integer id);
}
