/*
Google, Amazon...
 Application of Next Greater Element to Left
 Three Steps -> [pop() all smaller, catch the answer, push()]
span = idex - ngeli;   ngeli -> next Greater Element on Left index
*/
                        // Logic
                        
//  public static int[] solve(int[] arr){
//    int ngel[] = new int[arr.length];
//    int res[] = new int[arr.length];
   
//    Stack<Integer> st = new Stack<>();
//    st.push(0);
//    ngel[0] = -1;
   
//    for(int i = 1; i < arr.length;i++){
//        while(st.size() > 0 && arr[i] > arr[st.peek()]){
//            st.pop();
//        }
//        if(st.size() == 0){
//            ngel[i] = -1; 
//        }
//        else{
//            ngel[i] = st.peek();
//        }
//        st.push(i);
//    }
   
//    for(int i = 0; i <res.length; i++){
//        res[i] = i - ngel[i]; 
//    }
//    return res;
//  }




//  public static int[] solve(int[] arr){
//    int span[] = new int[arr.length];
//    Stack<Integer> st = new Stack<>();
   
//    st.push(0);
//    span[0] = 1;
   
//    for(int i = 1 ; i < arr.length; i++){
//        while(st.size() > 0 && arr[i] > arr[st.peek()]){
//            st.pop();
//        }
       
//        if(st.size() == 0){
//            span[i] = i + 1;;
//        }
//        else{
//            span[i] = i - st.peek();
//        }
//        st.push(i);
//    }
//    return span;
//  }
                


import java.io.*;
import java.util.*;

public class Stock_Span {
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

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr) {
        int span[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        span[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                span[i] = i + 1;
                ;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }

}