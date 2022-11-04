package Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressions {
    public static void main(String[] args) {
        Consumer c= s-> System.out.println(s);
        c.accept("Hi There testing the functional interface consumer");

        Supplier<String> s = ()->{
            String str ="Hi there testing supplier functional interface using lambda expressions in the get method";
            return str;
        };

        System.out.println(s.get());

        Predicate<Integer> p = integer-> integer%2==0;
        System.out.println(p.test(12));

        Function<Integer, String> f = num->{
            return "Using function functional interface using the apply() mehtod using the toString() method on the input integer"+ num.toString();

        };

        System.out.println(f.apply(10));
    }
}


