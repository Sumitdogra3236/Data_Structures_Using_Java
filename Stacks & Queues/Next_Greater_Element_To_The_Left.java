// Next Greater Element to the Left
import java.io.*;
import java.util.*;

public class Next_Greater_Element_To_The_Left {
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
        Stack<Integer> st = new Stack<>();
        int ngel[] = new int[arr.length];
        st.push(arr[0]);
        ngel[0] = -1;

        for(int i = 1; i < arr.length; i++){

            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size() ==0 ){
            ngel[i] = -1;
            }
         else {
            ngel[i] = st.peek();
        }
            
        st.push(arr[i]);
        }   
            return ngel;
        }
    }

