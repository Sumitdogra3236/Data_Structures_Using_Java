// Radix Sort
import java.io.*;
import java.util.*;

public class RadixSort {

    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }

        int count = 0;
        while (max != 0) {
            max = max / 10;
            count++;
        }
        int exp = 1;
        while (count != 0) {
            countSort(arr, exp);
            count--;
            exp *= 10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        int freq[] = new int[10];

        for (int val : arr) {
            freq[(val / exp) % 10]++;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int pos = (val / exp) % 10;
            int place = freq[pos];
            res[place - 1] = val;
            freq[pos]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }

        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }

}