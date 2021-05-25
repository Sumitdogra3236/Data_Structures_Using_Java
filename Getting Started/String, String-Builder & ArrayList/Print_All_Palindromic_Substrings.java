import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String str) {
        int len = str.length();

        String sb = "";
        for (int i = 0; i <= len; i++) {
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
        boolean flag = true;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                flag = false;
                return flag;
            }
            low++;
            high--;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}