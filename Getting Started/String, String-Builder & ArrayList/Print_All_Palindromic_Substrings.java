// Print all Palindromic Substrings

import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String str) {
        int len = str.length();

        String sb = "";
        for (int i = 0; i <= len - 1; i++) {
            for (int j = i + 1; j <= len; j++) {
                sb = str.substring(i, j);
                if (isPalindromic(sb)) {
                    System.out.println(sb);
                }
            }
        }

    }

    public static boolean isPalindromic(String str) {
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}