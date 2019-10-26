package com.cust.config.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Description
 * @Author Wangbo
 * @Date 2019/10/26
 * @Version V1.0
 **/
public class MyListener implements ServletContextListener {

    /**
     * @return void
     * @Author wangbo
     * @Description 监听Servlet容器的启动
     * @Date 8:41 下午 2019/10/26
     * @Param [sce]
     **/
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Servlet容器启动了");
    }

    /**
     * @return void
     * @Author wangbo
     * @Description 监听Servlet容器的销毁
     * @Date 8:42 下午 2019/10/26
     * @Param [sce]
     **/
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Servlet容器销毁了");
    }
}
