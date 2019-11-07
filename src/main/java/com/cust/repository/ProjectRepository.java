package com.cust.repository;

import com.cust.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description 用来操作数据表的Dao接口
 * @Author Wangbo
 * @Date 2019/11/07
 * @Version V1.0
 **/

//  继承JpaRepository来操作数据表，JpaRepository里面的两个范型，第一个是我们要操作的那个实体类，第二个是实体类中的主键的类型
public interface ProjectRepository extends JpaRepository<Project, Integer> {


}
