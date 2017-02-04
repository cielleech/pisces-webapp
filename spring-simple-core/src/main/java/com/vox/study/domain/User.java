package com.vox.study.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author cielleech
 *
 */
@Entity
@Table(name = "vip_user")
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    private Long id;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}