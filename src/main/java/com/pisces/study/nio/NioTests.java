package com.pisces.study.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTests {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("1234", "rw");
        
        FileChannel channel = file.getChannel();
        
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int bytesRead = channel.read(buffer);
    }
}
