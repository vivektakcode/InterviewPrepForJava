package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListFramework {
    public static void main(String[] args) {
        //declare an array
        //syntax: datatype[] variable name = new datatype[size of the array];
        int[] arr = new int[5];
        //arr reference variable will be pointing to the array object
        int [] ros;// here the reference variable is defined in the stack memory

        ros= new int[5];//here the actual object creation is happening in the heap memory which is being pointed by the reference variable ros
        //In C/C++ arrays are stored in continuous memory allocation

        Scanner sc = new Scanner(System.in);
       /* int k = sc.nextInt();
        for(int i=0; i<k;i++){
            ros[i]=i;
        }
        System.out.println(Arrays.toString(ros));
*/

        //In java, Array objects are stored in heap.
        //Heap memory is not continuous
        //Dynamic memory allocation happens at runtime in heap.
        //Hence, in java the array elements may not be stored in a continuous manner in the heap memory

        /*2D arrays
        * Syntax:
        * datatype[][] variable name = new datatype [rowsize][columnsize];
        * array of 1d-arrays
        * Rowsize is necessary to be defined, however we need not define the column size while declaring 2d arrays
        *
        * We can create any number of columns in the 2d arrays because its not mandatory to define the column size in 2d arrays
        * */

        int[][] arr1 = new int[3][];
        int[][] arr2= {
                {1, 2, 3},
                {1, 5, 4, 5},
                {3, 6, 9, 5, 67}
        };
        System.out.println(arr1.length);

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                    arr1[row][col]= sc.nextInt();
            }
        }

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.println(arr1[row][col]+" ");
            }
        }



        //Internal working of 2d arrays
        //We can create 3d arrays as well...but if we want to use higher dimensions then we should use python and numpy
        // as higher dimensions cant be visualised in other languages directly

        //Default values
        /*
        * int =0
        * long=0
        * float=0.0
        * double=0.0
        * String=null
        * char=null
        * boolean = false
        * short=0
        * byte=0
        * */



    }

}
