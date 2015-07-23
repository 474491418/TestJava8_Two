package edu.sust.test.channel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;


/**
 * Created by envy15 on 2015/7/20 0020.
 * used by TestJava8_Two
 */
public class TestChannel {

    public void test() {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("localhost", 8000));
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(8000));
            DatagramChannel datagramChannel = DatagramChannel.open();
            RandomAccessFile randomAccessFile = new RandomAccessFile("", "");
            FileChannel fileChannel = randomAccessFile.getChannel();
            FileInputStream fileInputStream=new FileInputStream("");
            FileChannel channel = fileInputStream.getChannel();
            channel.isOpen();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
