// Spiral Display
import java.io.*;
import java.util.*;

public class SpiralDisplay {

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
        SpiralDispaly(mat);
    }

    public static void SpiralDispaly(int mat[][]) {
        int rmin = 0, cmin = 0, rmax = mat.length - 1, cmax = mat[0].length - 1;
        int count = 0, totalEle = mat.length * mat[0].length;

        while (count < totalEle) {
            // left wall
            for (int i = rmin, j = cmin; i <= rmax && count < totalEle; i++) {
                System.out.println(mat[i][j]);
                count++;
            }

            // bottom wall

            for (int i = rmax, j = cmin + 1; j <= cmax && count < totalEle; j++) {
                System.out.println(mat[i][j]);
                count++;
            }

            // right wall

            for (int i = rmax - 1, j = cmax; i >= rmin && count < totalEle; i--) {
                System.out.println(mat[i][j]);
                count++;
            }

            // top wall
            for (int i = rmin, j = cmax - 1; j >= cmin + 1 && count < totalEle; j--) {
                System.out.println(mat[i][j]);
                count++;
            }
            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }
    }
}