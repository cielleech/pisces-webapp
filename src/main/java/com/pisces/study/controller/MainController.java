package com.pisces.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author cielleech
 *
 */
@RestController
public class MainController {

    /**
     * 
     * @param request
     * @return
     */
    @RequestMapping(value = { "/index" })
    public ModelAndView index(HttpServletRequest request) {
        return new ModelAndView("index.jsp");
        //        request.getSession().setAttribute("name", "lina");
        //        return "Hello world";
    }

    /**
     *
     * @param request
     * @param session
     * @return
     */
    @RequestMapping(value = { "/login" })
    public String login(HttpServletRequest request, HttpSession session) {
        String name = (String) session.getAttribute("name");
        return name;
    }
}
