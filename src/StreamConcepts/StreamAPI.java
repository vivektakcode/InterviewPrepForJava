package StreamConcepts;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12, 13, 1, 15, 16, 17);
        list.stream().filter(n-> n>=13).sorted().forEach(System.out::println);

    }
    }
