// 2-D Array Demo -> initialize, take input and print output

import java.io.*;
import java.util.*;

public class Matrix {

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int nr = scn.nextInt();
    int nc = scn.nextInt();
    int mat[][] = new int[nr][nc];
    
    // to take input in 2-D Array
    for(int i = 0; i < nr; i++){
        for(int j = 0; j < nc; j++){
            mat[i][j] = scn.nextInt();
        }
    }
    
    // To display 2-D Array
    for(int i=0;i<nr;i++){
        for(int j=0;j<nc;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
 }

}