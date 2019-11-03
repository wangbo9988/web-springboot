package com.cust.controller;

import com.cust.exception.ExceptionTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author wangbo
 * @version V1.0
 * @describe:
 * @date 2019/10/15
 */
@Controller
public class CentreController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("param") String param) {
        if (param.equals("aaa")) {
            throw new ExceptionTest();
        }
        return "Hello World";
    }

    @PostMapping(value = "/user/login")
    public String Login(@RequestParam("loginUsername") String loginUsername, @RequestParam("loginPassword") String loginPassword, Map<String, Object> map, HttpSession session) {
        if ("admin".equals(loginUsername) && "123456".equals(loginPassword)) {
            session.setAttribute("loginUser", loginUsername);
            return "redirect:/index";
//            return "success";
        } else {
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }

    // 测试jdbcTemplate
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/queryTest")
    @ResponseBody
    public Map<String, Object> map() {
        System.out.println("数据库操作测试");
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from Department");
        return maps.get(0);

    }
}
