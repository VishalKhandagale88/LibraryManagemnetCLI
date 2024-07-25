package java8features;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        List<Integer> integerList  = Arrays.asList(1,2,3);
        //lambda expression
        for (Integer integer : integerList){
            integer = integer*2;
            System.out.println(integer);
        }
        System.out.println("--------------------------------");

        //Syntax
        // agar single line hai then we don't need to give {}
        integerList.forEach(ahmed -> {
            ahmed = ahmed * 2;
            System.out.println(ahmed);
        });


        System.out.println(integerList);
    }
}
