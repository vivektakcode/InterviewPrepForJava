package CollectionsFramework.CvC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Address> addList= new ArrayList<>();
        addList.add(new Address("ABC", 24, 2334));
        addList.add(new Address("def", 25, 23378));
        addList.add(new Address("ghi", 26, 232346));
        addList.add(new Address("jkl", 27, 235436));

        Collections.sort(addList);
       /* System.out.println(addList);*/


        List<Employee> empList= new ArrayList<>();
        empList.add(new Employee("Ram",new Address("ABC", 24, 2334),80000));
        empList.add(new Employee("Shyam",new Address("jkl", 25, 279),90000));
        empList.add(new Employee("Ramjan",new Address("xyz", 26, 23348),20000));
        empList.add(new Employee("Ramadhir",new Address("erC", 28, 2334888),44000));

        Collections.sort(empList, EmployeeComparator.addressComparator);

        System.out.println(empList);
    }



}
