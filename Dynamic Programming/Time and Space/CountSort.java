
// Step 1: Make an freq[] array of size (max-min+1), coz unique no. can be all
// these
// Step 2: Fill the freq[] array with the frequency at the position, ie. val -
// min.
// Step 3: Then prepare the prefix sum of array starting of 1.
// Step 4: Make new res[] array, and fill the array , the travesing of the
// original array must start from end to make it stable sort, find the value of
// the idx, then find the position of the element by (val - min), then find the
// place of the position from the freq[] array, and fill the val at place-1
// position at the res[] array, then decrease the freq[pos] for another possible
// outcomes.
import java.io.*;
import java.util.*;

public class CountSort {

    public static void countSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int freq[] = new int[range];

        for (int val : arr) {
            int pos = val - min;
            freq[pos]++;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }
        int res[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int pos = val - min;
            int place = freq[pos];
            res[place - 1] = val;
            freq[pos]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        print(arr);
    }

}