package com.cust.controller;

import com.cust.exception.ExceptionTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
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
        } else {
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
