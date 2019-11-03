package com.cust.controller;

import com.cust.bean.Department;
import com.cust.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 注解版Mybatis测试
 * @Author Wangbo
 * @Date 2019/11/03
 * @Version V1.0
 **/

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    // 1、根据id查找对应的部门信息
    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDepartmentById(id);
    }
}
