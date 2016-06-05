package com.pisces.study.akka;

import akka.actor.UntypedActor;

/**
 * Created by cielleech on 16/5/17.
 */
public class HelloActor extends UntypedActor {

    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof String) {
            System.out.print(msg);
            getSender().tell("helloworld", getSelf());
        } else
            unhandled(msg);
    }
}
