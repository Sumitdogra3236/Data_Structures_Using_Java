// Difference of Two Arrays

import java.io.*;
import java.util.*;

public class Difference_of_Two_Arrays {

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
        Differnce_Of_Two_Arrays(arr1, arr2);
    }

    public static void Differnce_Of_Two_Arrays(int[] arr1, int[] arr2) {
        int res[] = new int[arr2.length];
        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;
        int p3 = res.length - 1;
        int borrow = 0;

        while (p3 >= 0) {
            int d1 = p1 < 0 ? 0 : arr1[p1];
            int d2 = p2 < 0 ? 0 : arr2[p2];

            int diff = d2 - d1 - borrow;
            if (diff < 0) {
                diff = diff + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            res[p3] = diff;
            p1--;
            p2--;
            p3--;
        }

        boolean flag = false;
        for (int idx = 0; idx < res.length; idx++) {
            if (res[idx] != 0) {
                flag = true;
            }
            if (flag) {
                System.out.println(res[idx]);
            }
        }

    }

}