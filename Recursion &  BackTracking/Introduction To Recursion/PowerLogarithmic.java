// Optimized code to find power Linear.

import java.io.*;
import java.util.*;
public class PowerLogarithmic {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = power(x, n);
        System.out.println(res);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xPowNb2 = power(x, n / 2);
        int xPowN = xPowNb2 * xPowNb2;
        if (n % 2 != 0) {
            return x * xPowN;
        }
        return xPowN;
    }
}