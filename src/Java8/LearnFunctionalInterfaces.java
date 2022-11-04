package Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


/*
* Functional Interface. These are the types of interfaces introduced in java 8
* where it can hold only one abstract method and many number of default and static methods.
* It can also declare methods of the object class
*
* Types of functional interfaces:
* 1. Consumer/ BiConsumer --> Takes String as an argument and returns nothing.
* Method used is accept(String s);
* 2. Supplier/ BiSupplier
* 3. Predicate/ BiPredicate
* 4. Function/ BiFunction
* */

public class LearnFunctionalInterfaces {
    public static void main(String[] args) {


        //Functional Interface consumer
        //Takes an input and doesn't return anything
        //method name accept()
        Consumer<String> consumer = s-> System.out.println(s.length());
        consumer.accept("Welcome");


        //Functional Interface function
        //Takes an input and provides an output...the input and output can be of the same type or can be of any different types as well
        //method name S apply(T t) where S is the return type generic and T is the parameter of generic type.
        Function<String, Integer> function = t->{ if(t.length()%2==0){
            return 2;
        }
        else{
            return 1;
        }
        };
        System.out.println(function.apply("even"));

        //Functional Interface Predicate -- returns true or false and takes an input
        //Method name test()
        Predicate<String> predicate = s->{
            if(s.length()%2==0){
                return true;
            }
            else{
                return false;
            }
        };

        System.out.println(predicate.test("Iameven"));

        //Functional Interface Supplier
        //doesn't take any arguement but provides a return type of the given implementation
        //method name is get()
        Supplier supplier = ()-> 20;
        System.out.println(supplier.get());


        //Used in MultiThreading
        Runnable runnable =()->System.out.println( "Thread started");
        //not part of the multithreading
        //runnable.run();
        //This is how we should use the runnable interface in multithreading.
        new Thread(runnable).start();

    }



}
