/*              Largest Area Histogram
Formula - >     
nser[i] - nsel[i] + 1 - 2;
i.e -> nser[i] - nsel[i] - 1;

*/

/*          Brute-Force
Time Complexity: O(N²)
Space Complexity: O(1)

static public int largestRectangleArea(int[] arr) {
        int maxArea = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < length; j++) {
                minHeight = Math.min(minHeight, arr[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }
-------------------------------------------------------------

                Optimized
Time Complexity: O(N)
Space Complexity: O(N)            

    public static int LargestAreaHistogram(int[] arr) {
        int nsel[] = nextSmallerOnLeft(arr);
        int nser[] = nextSmallerOnRight(arr);

        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            int hieght = arr[i];
            int width = nser[i] - nsel[i] - 1;
            int area = hieght * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

*/


import java.io.*;
import java.util.*;

public class LargestAreaHistogram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.print(LargestAreaHistogram(a));

    }

    public static int LargestAreaHistogram(int[] arr) {
        int nsel[] = nextSmallerOnLeft(arr);
        int nser[] = nextSmallerOnRight(arr);

        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            int hieght = arr[i];
            int width = nser[i] - nsel[i] - 1;
            int area = hieght * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static int[] nextSmallerOnLeft(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int nsel[] = new int[arr.length];
        nsel[0] = -1;
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nsel[i] = -1;
            } else {
                nsel[i] = st.peek();
            }
            st.push(i);
        }
        return nsel;
    }

    public static int[] nextSmallerOnRight(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int nser[] = new int[arr.length];
        nser[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nser[i] = arr.length;
            } else {
                nser[i] = st.peek();
            }
            st.push(i);
        }
        return nser;
    }

}