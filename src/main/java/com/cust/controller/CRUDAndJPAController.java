package com.cust.controller;

import com.cust.entity.Project;
import com.cust.repository.ProjectRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Description 通过JPA实现CRUD功能
 * @Author Wangbo
 * @Date 2019/11/07
 * @Version V1.0
 **/
@RestController
public class CRUDAndJPAController {

    //    注入我们的repository接口
    @Autowired  // 自动注入
    private ProjectRepository repository;

    @GetMapping("/pro/{id}")
    public Project getProjectById(@PathVariable("id") Integer id) {
        Project project = repository.getOne(id);    // 查询一条数据
        System.out.println(project.toString());
        return project;
    }

    @GetMapping("/pro")
    public Project insertPro(Project project) {
        Project save = repository.save(project);
        return save;
    }

}
