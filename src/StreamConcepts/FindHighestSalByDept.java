package StreamConcepts;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class FindHighestSalByDept {

    public static void main(String[] args) {
        List<Employee> employees=Stream.of(
                new Employee("Ram","support",89000),
                new Employee("Lakhan","support", 99000),
                new Employee("Bajrang","QA", 500000),
                new Employee("Salman","QA",900000),
                new Employee("Vivek","Dev",4500000)
        ).collect(Collectors.toList());

        //Approach 1

        /*Working of the syntax used
        * First we created a list of employees and used the Stream class's of() method to create our stream, then
        * we collected the objects created using collect(Collectors.toList())
        * After that we created a Map of employees segregated using the dept they are in,
        * We created this using the list of employees that we created
        * employees.stream().collect(groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(compareBySalary))));
        * This can be simplified using the list of employees and we converted it to a stream then collected the stream based on
        * the groupingBy() on dept of the employees and then we also used the Collectors.reducing() method to use the BinaryOperator on the MaxBy()
        * on the salary comparator that we created.
        *
        * */

        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> employeeMap = employees.stream().
                collect(
                        groupingBy(
                                Employee::getDept,
                                Collectors.reducing(
                                        BinaryOperator
                                                .maxBy(
                                                        compareBySalary
                                                )
                                )
                        )
                );
        System.out.println(employeeMap);




        //Approach 2

        Map<String,Employee> employeeMap1= employees.stream().
                collect(
                        Collectors.groupingBy(
                                Employee::getDept,
                                collectingAndThen(maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)
                                ));


        Map<String, Employee> collect = employees.stream().collect(groupingBy(
                Employee::getDept,
                collectingAndThen(maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get
                )));



        Map<String, Employee> employeesBySalary=employees.stream().collect(
                Collectors.groupingBy(
                        Employee::getDept,
                        collectingAndThen(maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)
                )
        );

        Comparator compareSalary = Comparator.comparing(Employee::getSalary);
    }


}
