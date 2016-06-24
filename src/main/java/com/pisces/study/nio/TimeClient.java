package com.pisces.study.nio;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author cielleech
 *
 */
public class TimeClient {
    private static final Logger logger = LoggerFactory.getLogger(TimeClient.class);

    public static void main(String[] args) throws IOException {
        logger.info("Client start");
        int port = 8888;
        try {
            if (args != null && args.length > 0) {
                port = Integer.valueOf(args[0]);
            }
        } catch (NumberFormatException e) {

        }

        new Thread(new TimeClientHandler("127.0.0.1", port), "NIO-Client").start();
    }
}
