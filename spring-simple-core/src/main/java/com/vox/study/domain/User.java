package com.vox.study.domain;

import java.io.Serializable;


/**
 * 
 * @author cielleech
 *
 */
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}