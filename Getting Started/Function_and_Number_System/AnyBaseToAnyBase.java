// To convert Any Base number to Any Base
import java.util.*;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int cVal = AnyBaseToAnyBase(n, sourceBase, destBase);
        System.out.println(cVal);

    }

    public static int AnyBaseToAnyBase(int num, int b1, int b2) {
        // Step 1 : Convert Any-Base to Decimal
        // Step 2 : Convert Decimal to Any-Base

        int dValue = getValueIndecimal(num, b1);
        int cValue = getValueInBase(dValue, b2);

        return cValue;
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