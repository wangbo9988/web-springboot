package com.cust.controller;

import com.cust.entity.Employees;
import com.cust.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 映射文件版Mybatis测试
 * @Author Wangbo
 * @Date 2019/11/04
 * @Version V1.0
 **/
@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    //    使用@PathVariable注解来获取路径中的id
    public Employees getEmployeeById(@PathVariable("id") Integer id) {
        return employeeMapper.getEmployeeById(id);
    }
}
