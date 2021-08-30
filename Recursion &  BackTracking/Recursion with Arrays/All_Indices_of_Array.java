// All Indices of Array

// primitive variable cannot be kept uninitialized, it give error variable might not have initialized.
// reference variable can be kept uninitialized, beacuse java provide the default value of null to reference variable.

                // Logic

// public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
//         if (idx == arr.length) {
//             return new int[fsf];
//         }
//         int res[];
//         if (arr[idx] == x) {
//             res = allIndices(arr, x, idx + 1, fsf + 1);
//             res[fsf] = idx;
//         } else {
//             res = allIndices(arr, x, idx + 1, fsf);
//         }
//         return res;
//     }



import java.io.*;
import java.util.*;

public class All_Indices_of_Array {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        int res[];
        if (arr[idx] == x) {
            res = allIndices(arr, x, idx + 1, fsf + 1);
            res[fsf] = idx;
        } else {
            res = allIndices(arr, x, idx + 1, fsf);
        }
        return res;
    }

}