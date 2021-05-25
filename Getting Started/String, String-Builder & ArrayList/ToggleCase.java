//        Character to ASCII or UNICODE
//        Charcter -> UNICODE
// char ch = 'K';
// int code = ch;
// System.out.println(ch);

//        UNICODE or ASCII to character
//        UNICODE -> Character
// int code = 109;
// char ch = (char)code;    -> typecast bcs int-> 4 bytes & char-> 2 ytes
// System.out.println(ch);


// Lower Case -> Upper Case ==> [ UC = 'A' + (ch -'a'); ]
// Upper Case -> Lower Case ==> [ LC = 'a' + (ch -'A'); ]



import java.io.*;
import java.util.*;

public class ToggleCase {

    public static String toggleCase(String str) {
        String res = "";
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);

            if (ch >= 'a' && ch <= 'z') { // character is lower case
                // convert it to upper case
                char up = (char) ('A' + (ch - 'a'));
                res += up;
            } else if (ch >= 'A' && ch <= 'Z') { // character is Upper Case
                // convert it to lower case
                char lc = (char) ('a' + (ch - 'A'));
                res += lc;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}