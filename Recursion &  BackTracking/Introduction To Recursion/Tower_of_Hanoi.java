// Expectation -> [TOH(10,11,12,3)] -> To print all the valid steps to move all disc from source to destination i.e 10 -> 12
// Faith 1) -> [TOH(10,12,11,2)] -> Program is capable of printing valid steps to move (n-1) or n == 2 disc from source to Helper i.e 10 -> 12
// Faith 2) -> [TOH(12,11,10,2)] -> Program is capable of printing valid steps to move (n-1) disc from source to Helper i.e 12 -> 11


import java.io.*;
import java.util.*;

public class Tower_of_Hanoi {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helper = scn.nextInt();
        // task -> to move n disks from src to dest using helper
        toh(src, dest, helper, n);
    }

    public static void toh(int src, int dest, int helper, int n) {
        if (n == 0) {
            return;
        }
        // move n-1 disks from src to helper
        toh(src, helper, dest, n - 1);
        // move nth disk  from src to dest
        System.out.println(n + "[" + src + " -> " + dest + "]");
        // move n-1 disks from helper to dest
        toh(helper, dest, src, n - 1);
    }

}