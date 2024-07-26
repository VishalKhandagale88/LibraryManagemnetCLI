package java8features.functionalinterfacedemo;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    int greet(int a, int b);
//    void hello();
    default void hello(int a, int b){
        System.out.println(a*b);
    }
    static void printMethod(String str){
        System.out.println("------------"+str+"------------");
    }
}
