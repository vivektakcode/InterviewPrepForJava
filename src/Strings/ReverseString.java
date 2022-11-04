package Strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(s);
        String str="";
        char ch;

        for(int i=0;i<s.length(); i++){
            ch =s.charAt(i);
            str = ch+str;
        }

        System.out.println(str);*/




        Scanner in = new Scanner(System.in);
        /*String strNew1= in.nextLine();
        StringBuilder strNew = new StringBuilder();
        strNew.append(strNew1).reverse();
        System.out.println(strNew);*/

        String str=in.nextLine();
        char ch;
        String rev="";
        for (int i = 0; i <str.length(); i++) {
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);

        //using stringbuilder

       /* String s1 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.reverse();
        System.out.println(sb);
*/
    }


}
