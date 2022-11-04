package StreamConcepts.mapvsflatMap;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class StreamOfUsers {

//what is collect() method---Collectors.toList() ??

    //Find the answer??
    public static void main(String[] args) {

        /*First we created a list of User object which contains five fields,
        *Then the list of objects is collected as a list
        * We use Stream.of(objects of User class and then transformed it as list)
        *
        * Then to use map() and flatMap() we used the list and ran a stream of it to use the map()
        *  function and passed method reference to it and collected it as a list
        *
        * */

        List<User> users= Stream.of(
                new User("vivektakwork123@gmail.com", "9587928439", "Vivek Tak",List.of((new String[]{"Hi", "There", "vivek"})) , 170000.80),
                new User("RandomJohn@gmail.com", "8890554562", "Joe Danny", List.of((new String[]{"Hi", "There", "John"})), 76000.0),
                new User("tomdickandharry@gmail.com", "7251925181", "Lala LajPat Rai", List.of((new String[]{"Hi", "There", "tom"})), 89000.0)
        ).toList();



        //Usage of map()--> when we want to get the list of something using a method reference then we use the map() function

        List<String> email = users.stream().map(User::getEmail).collect(toList());
        System.out.println(email);
        List<String> phoneNumbers = users.stream().map(User::getPhone).collect(toList());
        System.out.println(phoneNumbers);
        //Uses of flatMap
        List<String> info = users.stream().flatMap(x-> x.getInfo().stream()).collect(toList());
        System.out.println(info);



        /*Map and FlatMap
        *
        *
        * */

        System.out.println(users.stream().map(User::getName).collect(toList()));

        System.out.println(users.stream().flatMap(s->s.getInfo().stream()).collect(toList()));


        users.stream().map(User::getEmail).collect(toList());

        users.stream().flatMap(t-> t.getInfo().stream()).collect(toList());


    }
}




