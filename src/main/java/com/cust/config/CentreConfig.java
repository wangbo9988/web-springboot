package com.cust.config;

import com.cust.config.filter.MyFilter;
import com.cust.config.listener.MyListener;
import com.cust.config.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * @author wangbo
 * @version V1.0
 * @describe: SpringMVC 控制器
 * @date 2019/10/15
 */

@Configuration
public class CentreConfig implements WebMvcConfigurer {

    // 浏览器默认跳转路径
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        // 设置页面优先级
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 注册拦截器，设置拦截路径
        registry.addInterceptor(new LoginHanderInterceptor()).addPathPatterns("/**").excludePathPatterns("/", "/login",
                "/user/login", "/css/**", "/data/**", "/fonts/**", "/icons-reference/**", "/img/**", "/js/**", "/vendor/**");
    }

    // 添加自定义区域解析器到SpringMVC容器中
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResover();
    }

    // 注册JavaWeb三大组件

    /**
     * @return org.springframework.boot.web.servlet.ServletRegistrationBean
     * @Author wangbo
     * @Description 注册自定义的Servlet组件
     * @Date 8:45 下午 2019/10/26
     * @Param []
     **/
    @Bean
    public ServletRegistrationBean myServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(), "/myservlet");
        return registrationBean;
    }

    /**
     * @return org.springframework.boot.web.servlet.FilterRegistrationBean
     * @Author wangbo
     * @Description 注册自定义的Filter容器
     * @Date 8:47 下午 2019/10/26
     * @Param []
     **/
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello", "/myservlet"));
        return registrationBean;
    }

    /**
     * @return org.springframework.boot.web.servlet.ServletListenerRegistrationBean
     * @Author wangbo
     * @Description 注册自定义Listener组件
     * @Date 8:51 下午 2019/10/26
     * @Param []
     **/
    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return registrationBean;
    }

}
