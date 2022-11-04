package StreamConcepts.mapvsflatMap;

import java.util.List;

public class User {

    private String email;
    private String phone;
    private String name;

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    private List<String> info;
    private double salary;

    public User(String email, String phone, String name, List<String> info, double salary) {
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.info = info;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
