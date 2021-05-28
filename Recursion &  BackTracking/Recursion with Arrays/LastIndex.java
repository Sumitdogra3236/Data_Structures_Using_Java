// return Last index of array

import java.io.*;
import java.util.*;

public class LastIndex {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();

        System.out.println(lastIndex(arr, 0, x));

    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        int res = lastIndex(arr, idx + 1, x);
        if (res == -1) {
            if (arr[idx] == x) {
                return idx;      // res = idx; 
            } else
                return -1;
        }

        return res;
    }

}