package edu.sust.test.testFunctionInterface;

import javax.sql.rowset.Predicate;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 */
public class TestFunctional {
    static class Something {
        public static String startsWith(String a) {

            return String.valueOf(a.charAt(0));
        }
    }

    public static void main(String[] args) {
        // FunctionInterface<String, Integer> fi = (from) -> Integer.valueOf(from);//第一种写法
        // FunctionInterface<String, Integer> fi = Integer::valueOf;//第二种写法
        FunctionInterface<String, String> fi = Something::startsWith;//引用一个别的类的静态方法
        int num = 1;//虽然此时不用写final但是后面不能修改，否则不能编译，实际包含隐形final
        FunctionInterface<Integer, String> fi1 = (from) -> String.valueOf(from + num);
        String convert = fi1.convert(3);
        System.out.println(convert);

    }
}