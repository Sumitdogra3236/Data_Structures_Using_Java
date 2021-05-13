// Print Increasing using Recursion
import java.io.*;
import java.util.*;

public class Print_Increasing {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        while (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

}