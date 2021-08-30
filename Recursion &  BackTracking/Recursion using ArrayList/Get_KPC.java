// Get Key-Pad Combination

import java.io.*;
import java.util.*;

public class 

public class Get_KPC {
 {

    static String KeyPad[] = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getKPC(str));
    }

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> myList = new ArrayList<>();

        String word = KeyPad[ch - '0']; // minus the ascii of '0' character from the ascii of the ch
        // String word = KeyPad[Integer.parseInt(ch + "")];
        for (int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);
            for (String s : rres) {
                myList.add(alphabet + s);
            }
        }

        return myList;
    }
}