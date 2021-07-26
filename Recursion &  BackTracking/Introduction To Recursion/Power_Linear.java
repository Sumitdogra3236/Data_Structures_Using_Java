// Power Linear using recursion

import java.io.*;
import java.util.*;
public class Power_Linear {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = powerLinear(x, n);
        System.out.println(res);
    }

    public static int powerLinear(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerLinear(x, n - 1);
    }

}