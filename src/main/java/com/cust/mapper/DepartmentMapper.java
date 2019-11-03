package com.cust.mapper;

import com.cust.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Description 使用注解实现数据库操作
 * @Author Wangbo
 * @Date 2019/11/03
 * @Version V1.0
 **/

//@Mapper     // 指定这是一个操作数据库的Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM Department where dp_id=#{id}")
    public Department getDepartmentById(Integer id);

    @Delete("DELECT FROM Department where dp_id=#{id}")
    public int delDepatmentById(Integer id);

    @Insert("INSERT INTO Department(dp_id,dp_name,dp_numbers,dp_head) VALUES(#{dep})")
    public int insDepartment(Department dep);

    @Update("update Department set dp_numbser=numbers+1 where dp_id=#{id}")
    public int updDepartment(Department dep);

}
