// inp -> 2 
//       *
//       *  *


import java.util.*;

public class Pattern_1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
