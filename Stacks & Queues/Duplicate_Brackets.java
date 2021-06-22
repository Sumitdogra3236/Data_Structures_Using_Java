// Duplicate Brackets

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
                st.pop(); // for opening brackets
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}