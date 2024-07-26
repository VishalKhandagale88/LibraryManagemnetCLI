package java8features.functionalinterfacedemo;

public class Main {
    // interface
    // we cant instantiate an interface
//    FunctionalInterfaceDemo instanceOfInterface = ( new FunctionalInterfaceDemo() {
//        @Override
//        public void greet() {
//            System.out.println("Hello");
//        }
//    });
    public  void  method1(int a, int b){

    }

    public static void main(String[] args) {
        // method in functional interface is not taking any parameters in side
        //        FunctionalInterfaceDemo interfaceDemo = () -> System.out.println();


        // method in functional interface is taking any parameters in side
           //  FunctionalInterfaceDemo instanceOfInterface = (a,b) -> System.out.println(a*b);
          //       instanceOfInterface.greet(2,5);


        // method in functional interface is taking any parameters in side and returning some type
       //    FunctionalInterfaceDemo instanceOfInterface = (a,b) -> a-b;

       FunctionalInterfaceDemo instanceOfInterface = (a,b) -> a - b;
       ;
       int i = instanceOfInterface.greet(2,5);
        System.out.println(i);

        instanceOfInterface.hello(10,10);
        FunctionalInterfaceDemo.printMethod("Ahmned");
    }

    // before and after
    // before java 8
      // only abstract methods
     // method will not have body
     // can't instantiate -> object can't be created
    // After java 8
     //  all types of methods can be allowed
    // interface instantiation is allowed
    // new concept -> functional interface
    // with annotation


    // twist is : if we are returning something then {} braces are required


}
