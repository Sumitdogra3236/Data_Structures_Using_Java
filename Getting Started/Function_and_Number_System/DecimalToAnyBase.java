// To convert Decimal number to any Base

import java.util.*;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int res = 0;
        int pow = 1;

        while (n > 0) {
            int rem = n % b;
            res = res + (rem * pow);
            pow = pow * 10;
            n = n / b;

        }
        return res;
    }
}