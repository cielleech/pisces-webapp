package com.pisces.study.akka;

import akka.actor.UntypedActor;

/**
 * 
 * @author cielleech
 *
 */
public class ContextActor extends UntypedActor {

    /*
     * (non-Javadoc)
     * @see akka.actor.UntypedActor#onReceive(java.lang.Object)
     */
    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof RankRuleMessage) {
            
        }
    }

}
