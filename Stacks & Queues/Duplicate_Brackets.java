// Duplicate Brackets 
// Time Complexity is -> O(n).

import java.io.*;
import java.util.*;

public class Duplicate_Brackets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        System.out.println(isDuplicate(exp));

    }

    public static Boolean isDuplicate(String exp) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ')') {    
                if (st.peek() == '(') {
                    return true;
                }

                while (st.peek() != '(') {
                    st.pop();
                }
                if (!st.isEmpty())
                    st.pop(); // for opening brackets
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}

/*
   public static boolean isDuplicate(String exp){
        
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < exp.length();i++){
            char ch = exp.charAt(i);
            
            if(ch == ')'){      // settle
                int count = 0;
                while(st.peek() != '('){
                    st.pop();
                    count++;
                }
                // this pair of brackets is redundant
                if(count == 0){
                    return true;
                }
                st.pop(); // for '(' opening brackets
                
            }
            else if(ch != ' '){
                st.push(ch);
            }
        }
        return false;
    }
    */