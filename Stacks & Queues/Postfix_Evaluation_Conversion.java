import java.io.*;
import java.util.*;

public class Postfix_Evaluation_Conversion {
  

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String exp = scn.nextLine();
    
    Stack<Integer> eval = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<String> prefix = new Stack<>();
    
    
    for(int i = 0; i < exp.length(); i++){
        char ch = exp.charAt(i);
        
        if(ch >= '0' && ch <= '9'){
            eval.push(Integer.parseInt(ch+""));
            infix.push(ch+"");
            prefix.push(ch+"");
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            // evaluation
            int eval2 = eval.pop(), eval1 = eval.pop();
            if(ch == '+') eval.push(eval1 + eval2);
            else if(ch == '-') eval.push(eval1 - eval2);
            else if(ch == '*') eval.push(eval1 * eval2);
            else if(ch == '/') eval.push(eval1 / eval2);
            
            // infix
            String infixv2 = infix.pop(), infixv1 = infix.pop();
            infix.push("(" + infixv1 + ch + infixv2 + ")");
            
            
            // prefix
            String prefixv2 = prefix.pop(), prefixv1 = prefix.pop();
            prefix.push(ch + prefixv1 + prefixv2);
        }
    }
        System.out.println(eval.peek() + "\n" + infix.peek() + "\n" + prefix.peek() );
 }
}