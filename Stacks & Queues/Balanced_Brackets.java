// Balanced Brackets
/*
Conditions :
(i). No- mismatch -> i.e. (a+b]
(ii). no. of opening brackets == no. of closing brackets
(iii). Pairing. i.e. -> closing bracket should have same type of opening bracket anf vice-versa.
*/

import java.io.*;
import java.util.*;

public class Balanced_Brackets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        isBalanced(exp);
        System.out.println(isBalanced(exp));
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.isEmpty()) {
                    // nCB > nOB
                    return false;
                }

                if (ch == ')' && st.peek() != '(') {
                    return false;
                }
                if (ch == ']' && st.peek() != '[') {
                    return false;
                }
                if (ch == '}' && st.peek() != '{') {
                    return false;
                }

                st.pop();   // to pop opening brackets
            }
        }

        if (!st.isEmpty()) {
            // nOB > nCB
            return false;
        }

        return true;
    }

}