// Implementation of Binary Search

import java.io.*;
import java.util.*;

public class Broken_Economy {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        BrokenEconomy(arr, k);
    }

    public static void BrokenEconomy(int arr[], int k) {
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        int ceil = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                // ceil = arr[mid];
                // floor = arr[mid];
                ceil = floor = arr[mid];
                break;
            } else if (k < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            } else if (k > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            }
        }
        System.out.println(ceil + "\n" + floor);
    }

}