package java8practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractiseProblems {
    public static void main(String[] args) {
        StreamsPractiseProblems streamsPractiseProblems = new StreamsPractiseProblems();
        sumOfEvenNumbers();
        filterAndCollectString();
        convertToUpperCase();
        streamsPractiseProblems.findMax();
        streamsPractiseProblems.countEmptyStrings();
        streamsPractiseProblems.sortAndCollect();
        streamsPractiseProblems.groupByLength();
        streamsPractiseProblems.sumOfSquares();
    }
    public static void sumOfEvenNumbers(){
        List<Integer> numbers = Arrays.asList(1, 2, 11, 3, 4, 5, 6, 7, 8, 9, 10,12);

        List<Integer> evenNumbers = numbers.stream().filter(num -> num%2 ==0).toList();

        IntStream intStream = evenNumbers.stream().mapToInt(Integer::intValue);

        int sum = intStream.sum();

        System.out.println(sum);



    }
    public static void filterAndCollectString(){
        List<String> fruits = Arrays.asList("Apple","orange","banana","mango","apple","mango","berry","avocado");
        List<String> list = fruits.stream().filter(fruit -> fruit.startsWith("a")).toList();
        System.out.println(list);

    }
    public static void convertToUpperCase(){
        List<String> fruits = Arrays.asList("apple","orange","banana","mango","apple","mango","berry","avocado");
        List<String> upperCaseList = fruits.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseList);

    }
    public void findMax(){
        List<Integer> numbers = Arrays.asList(1, 2, 11, 3, 4, 5, 6, 7, 8, 9, 10,12);
        //Optional -> isPresent
        int number = numbers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(number);

    }
    public void countEmptyStrings(){
        List<String> fruits = Arrays.asList("apple","","","orange","banana","mango","apple","mango","berry","avocado","");
        long count = fruits.stream().filter(String::isEmpty).count();
        System.out.println(count);
    }

    public void sortAndCollect(){
        List<String> fruits = Arrays.asList("apple","","","orange","banana","mango","apple","mango","berry","avocado","");
        List<String> list = fruits.stream().sorted().toList();
        System.out.println(list);
    }
    public void groupByLength(){
        List<String> fruits = Arrays.asList("apple","","","orange","banana","mango","apple","mango","berry","avocado","");
        Map<Integer, List<String>> collect = fruits.stream().collect(Collectors.groupingBy(String::length));
        for (List<String> col : collect.values()){
            System.out.println(col);
        }
    }
   public void sumOfSquares(){
        // 1+4+9+16+25  = ?
       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
       int sum = list.stream().map(num -> num * num).mapToInt(Integer::intValue).sum();
       System.out.println(sum);
   }

}
