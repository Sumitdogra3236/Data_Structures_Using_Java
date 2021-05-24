// Rotate the array by 90 degree

import java.io.*;
import java.util.*;

public class RotateBy90 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        transpose(mat); // -> 1st Step-> Transpose
        reverserowwise(mat); // -> 2nd Step-> Reverse Row Wise
        display(mat); // Display the matrix
    }

    // transpose the matrix => row->column
    // 1st row -> 1st colums , 2nd row -> 2nd colums
    public static void transpose(int mat[][]) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    // reverse the element of array row-wise
    public static void reverserowwise(int mat[][]) {
        int n = mat.length;
        for (int r = 0; r < n; r++) {
            int low = 0, high = n - 1;
            while (low < high) {
                int temp = mat[r][low];
                mat[r][low] = mat[r][high];
                mat[r][high] = temp;
                low++;
                high--;
            }
        }

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}