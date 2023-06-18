package DSAQuestions.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncrementNumberAsArray {


    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int [] arr=new int[n];


    /*
    * What is to be done?
    * We will have an integer n as input
    * Next Line will contain n space separated integers as array.
    * We have to give output as a nmber with 1 added to it.
    *
    *
    *
    * */

    public static void main(String[] args){
        for(int i =0; i<=n-1; i++){
            arr[i]= sc.nextInt();
        }

        /*ArrayList<Integer> ans = new ArrayList<>();  //// Example : n=4, input array =[1,2,3,4], output array = []
        int carry=0;
        int val=0;
        for(int i=arr.length-1;i>=0;i--){ //i is taking the numbers from last to first in the array inside this loop //i=3
            if(i==arr.length-1){ //for first value of i
                val=(arr[i]+1+carry)%10; //value = jo bhi last digit hoga usme ek increment kr diya jayega //1st iteration, val=5
                carry=(arr[i]+1+carry)/10; //carry = 0 if arr[i]= any value between 0 to 8, carry =1, when arr[i]=9 //1st iteration carry = 5/10=0
            }
            else{ //for rest all values of i = arr.length -2 to 0        //for i=2
                val=(arr[i]+carry)%10; //value = arr[i] when carry =0, when carry =1 it will be a[i]+1 //i=2, value = 3
                carry=(arr[i]+carry)/10;//carry = 0 if arr[i]= any value between 0 to 8, carry =1, when arr[i]=9 carry = 0
            }

            ans.add(0,val); //List<Integer> ans = [5] // ans =[1 ,2 ,3, 5]
        }
        if(carry==1)
            ans.add(0,carry);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        }*/

    /*List<Integer> list = new ArrayList<>();
    int val =0;
    int carry =0;
    for(int i = arr.length-1;i>=0; i--){
        if(i==arr.length-1){
            val = (arr[i]+carry+1)%10;
            carry= (arr[i]+carry+1)/10;
        }
        else{
            val =(arr[i]+carry)%10;
            carry =(arr[i]+carry)/10;
        }
        list.add(0, val);
    }
    if(carry==1){
        list.add(0, carry);
    }
    for(int i=0; i<list.size();i++){
        System.out.println(list.get(i)+" ");
    }*/
        for(int i =0; i<result(arr).size(); i++){
            System.out.println(result(arr).get(i));
        }



    }

    static List<Integer> result(int[] arr){
        int carry =0;
        int val =0;
        List<Integer> result = new ArrayList<>();
        for(int i = arr.length-1; i>=0; i--){
            if(i==arr.length-1){
                val = (arr[i]+1+carry)%10;
                carry= (arr[i]+1+carry)/10;
            }
            else{
                val = (arr[i]+carry)%10;
                carry= (arr[i]+carry)/10;
            }
            result.add(0, val);
        }
        if(carry ==1){
            result.add(0, carry);
        }
        return result;
    }


}
