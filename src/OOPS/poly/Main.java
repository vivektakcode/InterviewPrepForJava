package OOPS.poly;

import OOPS.poly.DynamicPolymorphism;
import OOPS.poly.Polymorphism;

public class Main {
    public static void main(String[] args) {
        //Additional information--when printed alone a character is printed as a character but when concatenated with a number
        // then it will be converted to a number where the small alphabet starts from 97 and the big alphabet start from 65
        System.out.println('A'+1);

        //runtime polymorphism method overriding
        Polymorphism pChild = new DynamicPolymorphism();
        Polymorphism p= new Polymorphism();
        p.run();
        pChild.run();
    }

}
