package DSAQuestions.Arrays;

import java.util.Scanner;


//Rotate image of an Array by 90 degrees

//Solution: Steps: 1> Transpose the matrix
                 //2> Reverse every row
public class RotateImageOfArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix= readMatrix(m,n);
        rotate(matrix);

    }


    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i =0; i<n;i++){
            for(int j =i;j<n; j++){
                if(i!=j){
                    int tmp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=tmp;
                }
            }
        }

        for(int i =0; i<n; i++){
            int low=0; int high=n-1;
            while(low<=high){
                int tmp = matrix[i][high];
                matrix[i][high]=matrix[i][low];
                matrix[i][low]=tmp;
                high--;
                low++;
            }
        }
        return matrix;
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

    static int[][] transposeMatrix(int[][] arr){

        return null;
    }
}
