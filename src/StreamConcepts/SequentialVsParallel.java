package StreamConcepts;

import java.util.stream.IntStream;

public class SequentialVsParallel {

    //Sequential V/S parallel Streams

    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(t-> System.out.println(Thread.currentThread().getName()+t));
        System.out.println("**********************************************");
        IntStream.range(1, 10).parallel().forEach(t-> System.out.println(Thread.currentThread().getName()+t));



        //Check available coresin your system using
        System.out.println(Runtime.getRuntime().availableProcessors());







    }
}
