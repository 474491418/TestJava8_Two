package edu.sust.test.buffer;

import java.nio.CharBuffer;

/**
 * Created by envy15 on 2015/7/14 0014.
 * used by TestJava8_Two
 */
public class BufferTest {
    char[] myArray = new char[100];
    CharBuffer charBuffer = CharBuffer.wrap(myArray);

    public void test() {
        charBuffer.put('s');
        myArray[1]='a';
        System.out.println(myArray[0]);
        System.out.println(charBuffer.get(1));
    }

    public static void main(String[] args) {
        new BufferTest().test();
    }
}

