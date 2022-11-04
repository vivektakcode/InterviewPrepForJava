package StreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {
        StreamMethods sm = new StreamMethods();
  int[] list= new int[]{1, 2, 3, 5,6,7};
        Arrays.stream(list).sorted().forEach(System.out::println);
        List<String> liststr=new ArrayList<>();
        liststr.add("2344");
        liststr.add("afefa");
        liststr.add("asdafasf");
        String str= "Vivek";
        str.concat("Vivek");
       String str3= str.concat("Vivek");
        System.out.println(str3.intern());
        liststr.add("frgetb");
        liststr.stream().filter(x-> x.startsWith("a")).sorted().collect(Collectors.toList()).forEach(System.out::print);
        sm.list.add(12);
        sm.list.add(23);
        sm.list.add(25);
        sm.list.add(67);
        sm.list.stream().filter(x->x>10).sorted().collect(Collectors.toList());
        System.out.println(sm.list);
    }
    List<Integer> list= new ArrayList<>();

}
