package com.pisces.study.design.factorymethod;

/**
 * 
 * @author cielleech
 *
 */
public class AnimalFactory {
    public static Animal create(int type) {
        switch (type) {
        case 0:
            return new Dog();
        case 1:
            return new Cat();
        default:
            throw new IllegalArgumentException("type is invalid");
        }
    }
    
    public static void main(String[] args) {
        Animal animal = AnimalFactory.create(0);
        
        animal.println();
    }
}
