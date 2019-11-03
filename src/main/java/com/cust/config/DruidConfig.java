package com.cust.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description Druid数据源的相关配置类
 * @Author Wangbo
 * @Date 2019/11/03
 * @Version V1.0
 **/

@Configuration
public class DruidConfig {


    @ConfigurationProperties(prefix = "spring.datasource") // 把spring.datasource配置里的属性进行绑定
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    // 配置Druid的监控ß
    // 1、配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        // 配置Servlet初始化参数
        Map<String, String> initParams = new HashMap<>();
        initParams.put("loginUsername", "admin");   // 登陆后台是时的用户名
        initParams.put("loginPassword", "123456");  // 登陆后台时的密码
        initParams.put("allow", ""); // 允许，如果不写value值，默认允许所有访问
        initParams.put("deny", ""); // 拒绝访问对象
        servletRegistrationBean.setInitParameters(initParams);
        return servletRegistrationBean;
    }

    // 2、配置一个监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean<Filter> filterBean = new FilterRegistrationBean<>();
        filterBean.setFilter(new WebStatFilter());
        // 配置filter的初始化参数
        Map<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.js,*.css,/druid/*");    // 设置放行请求
        filterBean.setInitParameters(initParams);
        filterBean.setUrlPatterns(Arrays.asList("/*")); // 设置需要拦截的请求
        return filterBean;
    }

}
