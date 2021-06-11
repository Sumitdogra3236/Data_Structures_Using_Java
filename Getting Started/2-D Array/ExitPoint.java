
// Exit Point of a Matrix

import java.io.*;
import java.util.*;

public class ExitPoint {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        ExitPoint(mat);
    }

    public static void ExitPoint(int[][] mat) {
        int nr = mat.length;
        int nc = mat[0].length;

        int i = 0, j = 0, dir = 0;
        int prevI = -1;
        int prevJ = -1;

        while (i >= 0 && j >= 0 && i < nr && j < nc) {
            dir = (dir + mat[i][j]) % 4;
            prevI = i;
            prevJ = j;

            // East
            if (dir == 0) {
                j++;
            }

            // South
            if (dir == 1) {
                i++;
            }

            // West
            if (dir == 2) {
                j--;
            }

            // North
            if (dir == 3) {
                i--;
            }
        }
        System.out.println(prevI);
        System.out.println(prevJ);
    }

}