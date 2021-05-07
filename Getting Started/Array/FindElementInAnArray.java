// Find element in 1-D Array
import java.io.*;
import java.util.*;

public class FindElementInAnArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        int res = find(arr, x);
        System.out.println(res);
    }

    public static int find(int arr[], int x) {

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == x) {
                return idx;
            }
        }
        return -1;
    }
}