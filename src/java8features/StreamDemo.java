package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","orange","banana","mango","apple","mango");
        // filter only apples
        List<String> apple = fruits.stream().filter(fruit -> fruit.equalsIgnoreCase("apple")).toList();
        System.out.println(apple);

        List<String> slicedApples = apple.stream().map(fruit -> "Apple slice" ).toList();
        System.out.println(slicedApples);

        List<String> mangoList =  fruits.stream().filter(fruit -> fruit.equalsIgnoreCase("mango")).map(fruit -> "Mangoooo").toList();
        System.out.println(mangoList);


    }
}
