// Sliding_Window_Maximum
// MicroSoft, Adobe, Google, Amazon, Uber, Oracle, Apple, Bloomberg ... 


                        // Logic
                        // First find Next Greater Element to Right
// int j = 0;
// for(int i=0;i<=arr.length-k;i++){
// if(j < i){
// j = i;
//}
//  while(nger[j]<i+k){
//      j=nger[j];
//     }
//     System.out.println(arr[j]);
// }




import java.io.*;
import java.util.*;

public class Sliding_Window_Maximum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        int nger[] = new int[arr.length];
        nger[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                nger[i] = arr.length;
            } else {
                nger[i] = st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i <= arr.length - k; i++) {
            // if(j < i){
            // j = i;
            // }
            int j = i;
            while (nger[j] < i + k) {
                j = nger[j];
            }
            System.out.println(arr[j]);
        }
    }
}