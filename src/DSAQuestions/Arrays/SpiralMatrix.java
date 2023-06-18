package DSAQuestions.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static DSAQuestions.Arrays.IncrementNumberAsArray.n;

public class SpiralMatrix {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        List array=result(readMatrix(m,n));
        for(int i =0; i< array.size();i++){
            System.out.println(array.get(i));
        }
    }


    static int[][] readMatrix(int m, int n){
        Scanner sc = new Scanner(System.in);
        int [][] array = new int[m][n];
        for(int i =0; i<=m-1;i++){
            for(int j=0; j<=n-1;j++){
                    array[i][j]= sc.nextInt();
                }
            }
        return array;
    }



    static List<Integer> result(int[][] arr){
        List<Integer> list = new ArrayList<>();
        int row =arr.length; int col =arr[0].length;
        int top=0; int bottom =row-1; int left=0; int right=col-1;
        while(top<=bottom && left<=right){
            for(int i =left; i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            for(int i =top; i<=bottom; i++){
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right; i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }

      /*List<Integer> readAndReturnMatrix(int[][] matrix){
        List<Integer> result = new ArrayList<>();
          if(matrix == null || matrix.length == 0) {
              return result;
          }
          int m = matrix.length;
          int n = matrix[0].length;
        int top =0; int bottom =m-1; int right = n-1; int left =0;
        while(top<=bottom && left<=right){
        for(int i = left; i<=right; i++){
            result.add(matrix[top][i]);
        }
        top++;
        for(int i=top; i<=bottom; i++){
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
            for(int i = right; i>=left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i =bottom; i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        }
     return result;
    }*/
}
