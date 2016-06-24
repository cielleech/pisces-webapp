package com.pisces.study.nio;

import java.io.IOException;

/**
 * 
 * @author cielleech
 *
 */
public class TimeServer {
    public static void main(String[] args) throws IOException {
        int port = 8888;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {

            }
        }
        MultiplexerTimeServer server = new MultiplexerTimeServer(port);
        new Thread(server, "NIO-Server").start();
    }
}
