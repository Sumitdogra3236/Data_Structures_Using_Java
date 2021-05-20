// Bar Chart
import java.io.*;
import java.util.*;

public class Bar_Chart {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int max = 0;
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
            if (arr[idx] > max) {
                max = arr[idx];
            }
        }

        int nrows = max;
        int ncol = n;

        for (int row = nrows; row >= 1; row--) {
            for (int i = 0; i < ncol; i++) {
                if (arr[i] >= row) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}