

import java.io.*;
import java.util.*;

public class Prefix_Value_&_Conversion {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        Stack<Integer> eval = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch >= '0' && ch <= '9') {
                eval.push(Integer.parseInt(ch + ""));
                infix.push(ch + "");
                postfix.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // eval
                int val1 = eval.pop(), val2 = eval.pop();
                if (ch == '+')
                    eval.push(val1 + val2);
                if (ch == '-')
                    eval.push(val1 - val2);
                if (ch == '*')
                    eval.push(val1 * val2);
                if (ch == '/')
                    eval.push(val1 / val2);

                // infix
                String infixv1 = infix.pop(), infixv2 = infix.pop();
                infix.push("(" + infixv1 + ch + infixv2 + ")");

                // postfix

                String postfixv1 = postfix.pop(), postfixv2 = postfix.pop();
                postfix.push(postfixv1 + postfixv2 + ch);
            }
        }

        System.out.println(eval.pop() + "\n" + infix.pop() + "\n" + postfix.pop());
    }
}