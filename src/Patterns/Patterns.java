package Patterns;

import java.util.Scanner;

public class Patterns {


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
    }

    //pattern 1
    //triangle of stars
    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern of square of stars
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pattern of inverted triangle of stars
    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col = n; col>=row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //revverse triangle pattern
    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    //pattern 5

    //first go till given number then decrease the number of stars

    static void pattern5(int n){
        for (int row = 1; row< 2*n;row++){
            for(int col = row;col<=n;col++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }

}
