package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    public Employee select(Integer id);

}
