 // Span of Array ( Span = Max Element - Min Element in Array)
    import java.io.*;
    import java.util.*;

    public class SpanOfArray {

        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int span = SpanOfArray(arr);
            System.out.println(span);

        }

        public static int SpanOfArray(int arr[]) {

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return max - min;

        }
    }
