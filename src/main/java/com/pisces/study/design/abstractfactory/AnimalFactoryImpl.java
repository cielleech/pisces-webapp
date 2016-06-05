package com.pisces.study.design.abstractfactory;

public class AnimalFactoryImpl implements AnimalFactory {

    public Cat createCat() {
        return new Chinchilla();
    }

    public Dog createDog() {
        return new Teddy();
    }

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactoryImpl();
        
        Cat cat = factory.createCat();
        cat.mew();

        Dog dog = factory.createDog();
        dog.bark();
    }
}
