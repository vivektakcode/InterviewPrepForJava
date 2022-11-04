package Strings;

import java.util.Scanner;

public class LowNHigh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Integer k = sc.nextInt();
        System.out.println(lowNHigh(s, k));
    }


    static String lowNHigh(String s, int k) {
        String low = s.substring(0, k);
        String high = s.substring(0, k);

        for (int i = 1; i < s.length() - k + 1; i++) {
            if (s.substring(i, i + k).compareTo(low) <= 0) {
                low = s.substring(i, i + k);
            }

            if (s.substring(i, i + k).compareTo(high) >= 0) {
                high = s.substring(i, i + k);
            }


        }
        return low;
    }
}
