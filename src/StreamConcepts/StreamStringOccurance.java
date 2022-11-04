package StreamConcepts;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamStringOccurance {

    //WAP using streams to find the occurance of every character in a given string


        /*public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            //How does it work?

            *//*Arrays.stream() converts the object in a stream of objects
             * s.split("") takes the stream of each character of string and split it in a character
             * then .collect() method collects the characters and groupingBy() groups the characters based on the character and their count
             * Function.identity() does the character symbol and counting does the count of every character
             * *//*

            Map<String, Long> countMap = Arrays.stream(s.split("")).collect(
                    groupingBy(
                            Function.identity(),counting()
                    )
            );
            System.out.println(countMap);
        }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<String, Long> countMap= Arrays.stream(s.split("")).collect(
           groupingBy(Function.identity(),counting()
        )
        );
    }


    }

