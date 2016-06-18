package com.pisces.study.design.abstractfactory;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author cielleech
 *
 */
public class Chinchilla implements Cat {

    public void mew() {
        System.out.println("喵");
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        
        for (int i = 0; i < 100; i++) {
            final int j = i;
            service.submit(new Runnable() {
                /*
                 * (non-Javadoc)
                 * @see java.lang.Runnable#run()
                 */
                public void run() {
                    Random random = new Random();
                    int second = random.nextInt(1000);

                    try {
                        Thread.sleep(second);
                    } catch (Exception e) {

                    }

                    System.out.println("wait seconds: " + second + ", index:" + j);
                }
            });
        }
    }
}