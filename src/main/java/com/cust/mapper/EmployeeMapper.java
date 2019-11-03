package com.cust.mapper;

import com.cust.bean.Employees;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 通过映射文件的方式实现Mybatis操作数据库
 * @Author Wangbo
 * @Date 2019/11/03
 * @Version V1.0
 **/

//@Mapper
public interface EmployeeMapper {

    public Employees getEmployeeById(Integer id);

}
