package edu.sust.test.testLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 */
public class OldComparator {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("aa1", "zxc1", "bcs5", "ppo7", "peter", "anna", "mike", "xenia");
        Collections.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String str:nameList){
            System.out.println(str);
        }

    }
}