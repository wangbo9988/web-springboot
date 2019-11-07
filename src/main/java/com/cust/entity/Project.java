package com.cust.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * @Description 项目信息表
 * @Author Wangbo
 * @Date 2019/11/03
 * @Version V1.0
 **/
@Entity     //  @Entity——告诉JPA这是一个实体类（和数据库表映射的类）
@Table(name = "projects")  //  @Table——指定和那个数据表对应，以及指定数据表的各种规则；如果省略，默认表名就是project
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Project {


    @Id     //  @Id——表明这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
    private Integer pj_id;  //  项目编号

    @Column(length = 50)  // @Column——这是和数据表对应的一个列，我们还可以自定义设置它的字段名以及其他属性，省略的情况下，默认列名为属性名
    private String pj_name; //  项目名称

    @Column
    private Integer dp_id;  // 负责部门

    public Integer getPj_id() {
        return pj_id;
    }

    public void setPj_id(Integer pj_id) {
        this.pj_id = pj_id;
    }

    public String getPj_name() {
        return pj_name;
    }

    public void setPj_name(String pj_name) {
        this.pj_name = pj_name;
    }

    public Integer getDp_id() {
        return dp_id;
    }

    public void setDp_id(Integer dp_id) {
        this.dp_id = dp_id;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pj_id=" + pj_id +
                ", pj_name='" + pj_name + '\'' +
                ", dp_id=" + dp_id +
                '}';
    }
}
