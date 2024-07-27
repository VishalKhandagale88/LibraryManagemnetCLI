package java8practise;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functionalInterfacesPractiseProblems {
    public static void main(String[] args) {
        filterEvenNumbers();
        checkStringLength();
        validateAge();
        printListOfElement();
//        increaseAge();
        currentDate();
        squaredNumbers();
        upperCaseConversion();
    }
    // predicate
    public static void filterEvenNumbers(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9, 10);

        Predicate<Integer> integerPredicate = (num) -> num%2==0;

        List<Integer> list1 = list.stream().filter(integerPredicate).toList();

        System.out.println(list1);
    }
    public  static  void checkStringLength(){
        // check length is > 5 or not
        List<String> fruits = Arrays.asList("Apple","orange","banana","mango","apple","mango","berry","avocado");
        Predicate<String> stringPredicate = (string) -> string.length() > 5;
        List<String> list = fruits.stream().filter(stringPredicate).toList();
        System.out.println(list);
    }
    public static  void validateAge(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9, 10);
        Predicate<Integer> integerPredicate = (age) -> age >7;

        List<Integer> list1 = list.stream().filter(integerPredicate).toList();
        System.out.println(list1);
    }
    // consumer
    public static void printListOfElement(){
        List<String> fruits = Arrays.asList("Apple","orange","banana","mango","apple","mango","berry","avocado");

        Consumer<String> stringConsumer = System.out::println;
        fruits.forEach(stringConsumer);
    }
//    public static void appendValue(String value){
//        List<String> fruits = Arrays.asList("Apple","orange","banana","mango","apple","mango","berry","avocado");
//        Consumer<String> appendValue = (s) -> s.concat(value);
//        fruits.forEach(appendValue);
//    }
//    public static void increaseAge(){
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9, 10);
//        Consumer<Integer> integerConsumer = (num) -> num += 1;
//        ;
//        list.forEach(integerConsumer);
//        list.forEach(System.out::println);
//    }
    //supplier
    public static void currentDate(){
        Supplier<LocalDate> currentDate = LocalDate::now;
        System.out.println(currentDate.get());
    }
    //Function
    public static void squaredNumbers(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9, 10);
        Function<Integer,Integer> squareFunction = (n) -> n*n;
        List<Integer> list1 = list.stream().map(squareFunction).toList();
        System.out.println(list1);
    }
    public static void stringToInteger(){
        List<String> list = Arrays.asList("1", "2", "3","4", "5", "6", "6", "7");
        Function<String,Integer> stringIntegerFunction = Integer::parseInt;
        List<Integer> list1 = list.stream().map(stringIntegerFunction).toList();
        System.out.println(list1);

    }
    public static void upperCaseConversion(){
        List<String> fruits = Arrays.asList("Apple","orange","banana","mango","apple","mango","berry","avocado");
        Function<String,String> upperCaseFunction = String::toUpperCase;

        List<String> list = fruits.stream().map(upperCaseFunction).toList();
        System.out.println(list);

    }
}
