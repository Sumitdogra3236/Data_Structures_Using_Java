// String Compression 

import java.io.*;
import java.util.*;

public class Main {

    public static String compression1(String str) {
        String res = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                // do nothing
            } else {
                res += curr;
            }
        }

        return res;
    }

    public static String compression2(String str) {
        String res = str.charAt(0) + "";

        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    res += count;
                    count = 1;
                }
                res += curr;
            }
        }
        if (count > 1) {
            res += count;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}
