package com.pisces.study.design.abstractfactory;

/**
 * 
 * @author cielleech
 *
 */
public interface AnimalFactory {
    /**
     *
     * @return
     */
    Cat createCat();

    /**
     *
     * @return
     */
    Dog createDog();
}
