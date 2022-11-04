package CollectionsFramework.CvC;

import java.util.Comparator;

public class EmployeeComparator {

    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary()-o2.getSalary();
        }
    };

    public static Comparator<Employee> addressComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getAddress().compareTo(o2.getAddress())
;        }
    };



}

