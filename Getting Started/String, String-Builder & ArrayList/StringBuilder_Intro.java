// Strore data as a ArrayList of characters

public class StringBuilder_Intro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb); 
        char ch = sb.charAt(2);
        System.out.println(ch);

        // System.out.println(sb.reverse()); // -> not change the original array
        System.out.println(sb);

        sb.append(" world"); // --> append single word as '' & string as "" at the end of the sb
        sb.append(123);

        System.out.println(sb);

        System.out.println(sb.length());
        
        sb.setCharAt(1, 'I');
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        System.out.println(sb.substring(5));

        sb.toString(); // toString() -> start involving intern pool
    }
}
