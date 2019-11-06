package com.cust.entity;

/**
 * @Description 项目信息表
 * @Author Wangbo
 * @Date 2019/11/03
 * @Version V1.0
 **/
public class Project {

    private int pj_id;  //  项目编号
    private String pj_name; //  项目名称
    private int dp_id;  // 负责部门

    @Override
    public String toString() {
        return "Project{" +
                "pj_id=" + pj_id +
                ", pj_name='" + pj_name + '\'' +
                ", dp_id=" + dp_id +
                '}';
    }

    public int getPj_id() {
        return pj_id;
    }

    public void setPj_id(int pj_id) {
        this.pj_id = pj_id;
    }

    public String getPj_name() {
        return pj_name;
    }

    public void setPj_name(String pj_name) {
        this.pj_name = pj_name;
    }

    public int getDp_id() {
        return dp_id;
    }

    public void setDp_id(int dp_id) {
        this.dp_id = dp_id;
    }
}
