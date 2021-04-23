// To convert any base number to decimal number
import java.util.*;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int pos = 0;
        int res = 0;
        while (n != 0) {
            int rem = n % 10;
            res = res + (rem * (int) Math.pow(b, pos));
            pos++;
            n = n / 10;
        }
        return res;
    }
}