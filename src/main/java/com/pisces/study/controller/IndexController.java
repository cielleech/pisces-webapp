package com.pisces.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author cielleech
 *
 */
@RestController
public class IndexController {
    
    /**
     * 
     * @param request
     * @return
     */
    @RequestMapping(value = { "/index" })
    public String index(HttpServletRequest request, HttpSession session) {
        session.setAttribute("name", "lina");
        return "Hello world";
    }
    
    @RequestMapping(value = { "/login" })
    public String login(HttpServletRequest request, HttpSession session) {
        String name = (String) session.getAttribute("name");
        return name;
    }
}
