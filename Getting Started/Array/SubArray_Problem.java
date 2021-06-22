// Print Sub-Array of Array  
// SubArray => continuous sub-part of Array

import java.io.*;
import java.util.*;

public class SubArray_Problem {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        SubArray(arr);
    }

    public static void SubArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int idx = i; idx <= j; idx++) {
                    System.out.print(arr[idx] + "\t");
                }
                System.out.println();
            }
        }
    }
}