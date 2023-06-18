package Classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {1, 12, 11, 6, -1, 0};

        int[] arrNew= new int[6];
        for(int i=0; i<arr.length-1;i++){
            int product = 1;
            for(int j =i+1;j<arr.length-1;j++){
                product = arr[j]*product;
                arrNew[i]= product;
            }
        }
        System.out.println(Arrays.toString(arrNew));
    }

}
