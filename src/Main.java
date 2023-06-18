import java.util.*;

class AdditionOfMatrixDebug {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrixOne = new int[n][m];
        int[][] matrixTwo = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixOne[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixTwo[i][j] = sc.nextInt();
            }
        }

        int[][] result = additionOfMatrix(matrixOne, matrixTwo, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] additionOfMatrix(int[][] matrixOne, int[][] matrixTwo, int n, int m) {
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        return ans;
    }
}