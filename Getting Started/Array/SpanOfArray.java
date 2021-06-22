 // Span of Array ( Span = Max Element - Min Element in Array) 
    import java.io.*;
 import java.util.*;

 public class SpanOfArray {

     public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int arr[] = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i] = scn.nextInt();
         }

         int span = span(arr);
         System.out.println(span);

     }

     public static int span(int arr[]) {
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         for (int val : arr) {
             if (val > max) {
                 max = val;
             }
             if (val < min) {
                 min = val;
             }
         }
         return max - min;
     }
 }