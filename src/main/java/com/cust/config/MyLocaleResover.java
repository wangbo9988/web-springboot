package com.cust.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author wangbo
 * @version V1.0
 * @describe:   自定义区域解析器,用于国际化
 * @date 2019/10/17
 */
@Configuration
public class MyLocaleResover implements LocaleResolver {

    // 自定义区域解析器
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l");   // 获取区域请求参数 l
        Locale locale = Locale.getDefault();    // 设置Locale（区域信息对象）的默认值
        if (!StringUtils.isEmpty(l)) {  // 获取到参数
            String[] ls = l.split("_"); // 进行拆分，拆分出语言（例：zh）和国家（例：CN）
            locale = new Locale(ls[0], ls[1]); // 构造Locale对象
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
    }
}
