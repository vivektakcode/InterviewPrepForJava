package DSAQuestions.Arrays;

import java.util.Scanner;

public class StockPriceToMaximiseProfit {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1= readMatrix(n);
        int m =result(array1);
        System.out.println(m);
    }

    static int[] readMatrix(int n){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[n];
        for(int i =0; i<=n-1;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }

    static int result(int[] prices){
        int op=0;
        int pist =0;
        int lsf=Integer.MAX_VALUE;
        for(int i =0; i<=prices.length-1;i++){
            if(prices[i]<lsf){
                lsf=prices[i];
            }
            pist=prices[i]-lsf;
            if(op<pist){
                op=pist;
            }
        }
        return op;
    }



}
