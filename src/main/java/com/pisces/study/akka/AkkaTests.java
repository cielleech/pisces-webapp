package com.pisces.study.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * 
 * @author cielleech
 *
 */
public class AkkaTests {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("hello");
        
        ActorRef actor = system.actorOf(Props.create(HelloActor.class), "greeter");
        
        actor.tell("Hello world", ActorRef.noSender());

        system.terminate();
    }
    

}
