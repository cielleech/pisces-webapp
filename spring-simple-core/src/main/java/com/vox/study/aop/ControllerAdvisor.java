package com.vox.study.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 * @author cielleech
 *
 */
@Component
public class ControllerAdvisor {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAdvisor.class);
    
    public void before() {

    }
    
    public void test() {
    	
    }
    
    public static void main(String[] args) {
        logger.info("this is a test");
    }
}