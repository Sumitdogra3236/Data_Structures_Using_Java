// Rotate an Array 
import java.io.*;
import java.util.*;

public class Rotate_An_Array {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] arr, int k) {
        int len = arr.length;
        k = k % len;
        if (k < 0) {
            k = k + len;
        }

        reverse(arr, len - k, len - 1);
        reverse(arr, 0, len - 1 - k);
        reverse(arr, 0, len - 1);

    }

    public static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}