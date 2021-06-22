// Find First Index and Last Index of a given number 

import java.io.*;
import java.util.*;

public class FirstIndex_and_LastIndex {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int FIndex = FirstIndex(arr, d); // First Index
        int LIndex = LastIndex(arr, d); // Last Index
        System.out.println(FIndex);
        System.out.println(LIndex);
    }

    public static int FirstIndex(int[] arr, int d) {
        int firstIndex = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == d) {
                firstIndex = mid;
                high = mid - 1;
            } else if (d < arr[mid]) {
                high = mid - 1;
            } else if (d > arr[mid]) {
                low = mid + 1;
            }
        }
        return firstIndex;
    }

    public static int LastIndex(int[] arr, int d) {
        int LastIndex = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == d) {
                LastIndex = mid;
                low = mid + 1;
            } else if (d < arr[mid]) {
                high = mid - 1;
            } else if (d > arr[mid]) {
                low = mid + 1;
            }
        }
        return LastIndex;
    }

}