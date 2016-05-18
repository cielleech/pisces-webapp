package com.pisces.study.aop;

import org.springframework.stereotype.Component;

@Component
public class ControllerAdvisor {
    public void test() {
        System.out.println("index is executing");
    }
}
