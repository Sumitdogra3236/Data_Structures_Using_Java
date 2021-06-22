// Stack -> Stack is a linear data structure which follows a particular order in which the operations are performed
// Follows LIFO operation -> Last In First Out
// push() -> to push the element in the Stack
// peek() -> to view top most element
// pop() -> peek() + remove top most element from the Stack
// size() -> returns the size of the Stack
// isEmpty() -> returns a Boolean Value (True/False), whether the Stack is Empty or not Empty 


import java.util.Stack;
public class Stack_Intro {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st);

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st.pop());

        System.out.println(st);

        System.out.println(st.size());
        System.out.println(st.isEmpty());
        
    }
}
