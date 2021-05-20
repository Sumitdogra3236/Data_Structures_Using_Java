import java.io.*;
import java.util.*;

public class Sum_of_Two_Arrays {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        sumofarray(arr1, arr2);
    }

    public static void sumofarray(int[] arr1, int[] arr2) {
        int len = Math.max(arr1.length, arr2.length) + 1;
        int res[] = new int[len];

        int a1 = arr1.length - 1;
        int a2 = arr2.length - 1;
        int a3 = res.length - 1;
        int carry = 0;
        while (a3 >= 0) {
            int sum = 0;
            if (a1 >= 0) {
                sum += arr1[a1];
            }
            if (a2 >= 0) {
                sum += arr2[a2];
            }
            sum = sum + carry;
            int num = sum % 10;
            carry = sum / 10;
            res[a3] = num;
            a1--;
            a2--;
            a3--;
        }
        if (res[0] != 0) {
            System.out.println(res[0]);
        }
        for (int i = 1; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}