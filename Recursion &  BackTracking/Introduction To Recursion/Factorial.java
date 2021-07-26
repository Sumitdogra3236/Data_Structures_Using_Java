// Factorial of a number using recursion

import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}