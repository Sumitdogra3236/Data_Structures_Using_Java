// inp -> 5
//      *   *   *   *   *
//      *   *   *   * 
//      *   *   *   
//      *   *
//      *

import java.util.*;

public class Pattern_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n + 1 - r; c++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}