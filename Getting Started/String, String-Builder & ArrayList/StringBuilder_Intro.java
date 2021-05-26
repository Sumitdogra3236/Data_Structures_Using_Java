// Strore data as a ArrayList of characters

public class StringBuilder_Intro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb); 
        char ch = sb.charAt(2);
        System.out.println(ch);

        System.out.println(sb.reverse()); // -> not change the original array
    }
}
