package com.cust.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangbo
 * @version V1.0
 * @describe:   SpringMVC 控制器
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

}
