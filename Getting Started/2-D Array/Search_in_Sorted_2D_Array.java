// Search in Sorted 2-D Array

import java.io.*;
import java.util.*;

public class Search_in_Sorted_2D_Array {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] mat = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();
        SearchInSortedArray(mat,x);
    }
    
    // in 4*4 matrix , started searching from mat[0,3];
    // public static void SearchInSortedArray(int mat[][], int x){
    //     int n = mat.length;
    //     int i =0, j = n-1;
        
    // while(i < n && j >= 0 ){
    //     if(mat[i][j] == x){
    //         System.out.println(i);
    //         System.out.println(j);
    //         return;
    //     }
        
    //     else if(x < mat[i][j]){
    //         j--;
    //     } 
    //     else if(x > mat[i][j]){
    //         i++;
    //     }
    // }
    // System.out.println("Not Found");
        
    // }

// int matrix of 4*4 we started searching from mat[3,0]

public static void SearchInSortedArray(int mat[][], int x){
        int n = mat.length;
        int i =n-1, j = 0;
        
    while(i >= 0 && j < n ){
        if(mat[i][j] == x){
            System.out.println(i);
            System.out.println(j);
            return;
        }
        
        else if(x < mat[i][j]){
            i--;
        } 
        else if(x > mat[i][j]){
            j++;
        }
    }
    System.out.println("Not Found");
        
    }
}