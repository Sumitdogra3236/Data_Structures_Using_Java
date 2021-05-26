// Print all permutation of a string iteratively
//      reference -> Permutation-1.png & Permutation-2.png

import java.io.*;
import java.util.*;

public class Print_all_Permutation_of_a_String {

    public static void solution(String str) {
        int n = str.length();
        int totalPerm = factorial(n);

        for (int num = 0; num < totalPerm; num++) {
            String res = "";
            int tmp = n;
            int val = num;
            String mstr = str;
            while (tmp != 0) {
                int rem = val % tmp;
                val = val / tmp;
                res += mstr.charAt(rem);

                String lp = mstr.substring(0, rem);
                String rp = mstr.substring(rem + 1);

                mstr = lp + rp;
                tmp--;

            }
            System.out.println(res);
        }

    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}