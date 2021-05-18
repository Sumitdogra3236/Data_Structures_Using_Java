// Inverse of An Array
import java.io.*;
import java.util.*;

public class Inverse_Of_An_Array {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static int[] inverse(int[] arr) {
        int inv_arr[] = new int[arr.length];
        for (int idx = 0; idx < arr.length; idx++) {
            int value = arr[idx];
            inv_arr[value] = idx;
        }
        return inv_arr;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }

}