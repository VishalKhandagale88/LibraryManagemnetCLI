package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        List<Integer> integerList  = Arrays.asList(1,2,3);
        //lambda expression
        for (Integer integer : integerList){
            integer = integer*2;
//            System.out.println(integer);
        }
        System.out.println("--------------------------------");

        integerList.forEach(System.out::println);
        //Syntax
        // agar single line hai then we don't need to give {}
        integerList.forEach(ahmed -> {
            ahmed = ahmed * 2;
            System.out.println(ahmed);
        });

//        List<Integer> integers =Arrays.asList(1,23,4356,64,5653,45,34,53,45,24,24,2,34,5653,5653,5653);
//        integers.stream().filter(num -> num == 5653).forEach(i -> System.out.println(i));
//
//        System.out.println(integerList);

        List<String> list = Arrays.asList("vishal", "Ahmed", "Ali");
        list.forEach(LambdaExpressionDemo :: printThis);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
    public static  void  printThis(String s){
        System.out.println(s);
    }

}
