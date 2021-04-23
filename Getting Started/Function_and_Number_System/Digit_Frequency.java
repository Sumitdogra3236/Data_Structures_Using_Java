// To count the frequency of a digit occuring in a number using functions in Java
import java.util.*;

public class Digit_Frequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        
        while(n!=0){
            int digit = n % 10;
            if(digit == d){
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}