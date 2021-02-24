package com.example.springbootmybatis.controller;


import com.example.springbootmybatis.mapper.EmployeeMapper;
import com.example.springbootmybatis.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @ResponseBody
    @GetMapping("/emp/{id}")
    public Employee select(@PathVariable Integer id){
        return employeeMapper.select(id);
    }


}
