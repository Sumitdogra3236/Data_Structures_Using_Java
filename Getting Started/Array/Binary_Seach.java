// Binary Search in a Sorted Array
// To implement Binary Search Array must be Sorted
// Complexity is -> O(log n)

import java.io.*;
import java.util.*;

public class Binary_Seach {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int data = 60;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                System.out.println(mid);
                return;
            }

        }
        System.out.println("Number not in Array");

    }

}

// ------------------------------------------------------//

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int arr[] = { 10, 25, 30, 46, 56, 63, 79, 84, 98, 105, 121 };
//         int element = 30;
//         int res = BinarySearch(arr, element);
//         System.out.println(res);

//     }

//     public static int BinarySearch(int[] arr, int element) {
//         int low = 0;
//         int high = arr.length - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == element) { // element found
//                 return mid;
//             } else if (arr[mid] > element) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }

//         }
//         return -1; // element not present in array
//     }
// }