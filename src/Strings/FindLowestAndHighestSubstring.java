package Strings;

import java.util.Scanner;

public class FindLowestAndHighestSubstring {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();
        sNL(s, k);

    }

    static void sNL(String s, int k){
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for(int i=0;i<=s.length()-k;i++){
            if(s.substring(i, i+k).compareTo(smallest)<=0){
                smallest=s.substring(i, i+k);
            }
            if(s.substring(i, i+k).compareTo(largest)>=0){
                largest=s.substring(i, i+k);
            }


        }
        System.out.println(smallest+"\n"+largest);
    }

}
