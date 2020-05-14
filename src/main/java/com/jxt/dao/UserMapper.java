package com.jxt.dao;

import com.jxt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
   User getUserByName(String name);
}
