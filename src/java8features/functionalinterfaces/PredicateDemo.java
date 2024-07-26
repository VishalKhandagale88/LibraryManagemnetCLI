package java8features.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {
    public static void main(String[] args) {
        // functional interface
        // only one abstract method

        // lambda expression
        Predicate<String> stringPredicate1 = (String s) -> s.isEmpty();
        boolean isBlank = stringPredicate1.test("Ahmed");
        System.out.println(isBlank);

        Predicate<Integer> integerPredicate = (Integer i) -> i.equals(0);
        boolean b = integerPredicate.test(0);
        System.out.println(b);

        // method referencing ::
        Predicate<String> stringPredicate = String::isEmpty;
        boolean test = stringPredicate.test("");
        System.out.println(test);

        //Function
        //R	apply(T t)
        Function<String,Integer> function = String::length;
        Integer length = function.apply("Ahmed");
        System.out.println(length);

        //
        Consumer<String> consumer = System.out::println;
        consumer.accept("Vishal");
        Supplier<Double> supplier = Math::random;
        Double randomValue = supplier.get();
        System.out.println(randomValue);

    }
    public void  hello(){

    }
}
