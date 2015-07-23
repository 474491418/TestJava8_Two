package edu.sust.test.buffer;

import java.nio.CharBuffer;
import java.util.Random;

/**
 * Created by envy15 on 2015/7/14 0014.
 * used by TestJava8_Two
 */
public class BufferTest {
    char[] myArray = new char[10];
    CharBuffer charBuffer = CharBuffer.wrap(myArray);

    public void test() {
        charBuffer.put('s');
        myArray[1] = 'a';
        myArray[2] = 'e';
        myArray[3] = 'q';
        myArray[4] = 'n';
        System.out.println(myArray[0]);
        System.out.println(charBuffer.get(1));
        System.out.println(charBuffer.arrayOffset());
        charBuffer.position(2).limit(6);
        charBuffer.slice();
        System.out.println(charBuffer.length());

        for (int i = 0; i < charBuffer.length(); i++) System.out.println(charBuffer.get(i) + " " + i);

    }

    public static void main(String[] args) {
        new BufferTest().test();
       // System.out.printf("哈哈！%s", 1);
        Random random=new Random();
        System.out.println(random.nextInt(3));;

        //System.exit(0);
    }
}

