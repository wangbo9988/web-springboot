package com.cust.config.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Description
 * @Author Wangbo
 * @Date 2019/10/26
 * @Version V1.0
 **/
public class MyFilter implements Filter {

    /**
     * @return void
     * @Author wangbo
     * @Description 初始化filter
     * @Date 8:38 下午 2019/10/26
     * @Param [filterConfig]
     **/
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * @return void
     * @Author wangbo
     * @Description filter的过滤器
     * @Date 8:38 下午 2019/10/26
     * @Param [request, response, chain]
     **/
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter执行了过滤器");
        chain.doFilter(request, response);
    }

    /**
     * @return void
     * @Author wangbo
     * @Description filter的销毁器
     * @Date 8:38 下午 2019/10/26
     * @Param []
     **/
    @Override
    public void destroy() {

    }
}
