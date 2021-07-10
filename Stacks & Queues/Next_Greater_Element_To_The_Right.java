// MicroSoft, Amazon, Facebook...
// Three Steps -> [pop() all smaller elements, if st->empty = NGER = -1 else NGER = st.peek(), push()]
                    // Logic

//     public static int[] solve(int[] arr) {
//         int res[] = new int[arr.length];
//         Stack<Integer> st = new Stack<>();   
//         res[arr.length - 1] = -1;
//         st.push(arr[arr.length - 1]);

//         for (int i = arr.length - 2; i >= 0; i--) {
//             // while(st.peek() < arr[i] && st.size() > 0){
//             while (st.size() > 0 && arr[i] > st.peek()) {
//                 st.pop();
//             }
//             if (st.size() == 0) {
//                 res[i] = -1;
//             } else {
//                 res[i] = st.peek();
//             }
//             st.push(arr[i]);
//         }

//         return res;
// }
import java.io.*;
import java.util.*;

public class Next_Greater_Element_To_The_Right {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        res[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            // while(st.peek() < arr[i] && st.size() > 0){
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return res;
    }

}