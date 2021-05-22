// Subset of Array -> Math.pow(2,n);

import java.io.*;
import java.util.*;

public class Subser_of_Array{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    printSubset(arr);
 }
 
 public static void printSubset(int[] arr){
     int len = arr.length;
     int totalWork = (int) Math.pow(2,len);
     for(int i=0;i<totalWork;i++){
         int bNum = getBinary(i);
         printSeq(arr,bNum);
     }
     
 }
 public static void printSeq (int[] arr, int bNum){
    String str = "";
    int n = arr.length;
    int idx = n-1;
    
    while(n != 0){
        int rem = bNum % 10;
        bNum = bNum / 10;
        
        if(rem == 0){
            str = "-\t" + str;
        }
        else {
            str = arr[idx]+ "\t" + str;
        }
        idx--;
        n--;
    }
    System.out.println(str);
    
 }
 
 
 public static  int getBinary(int num){
     int rv =0;
     int pow = 1;
      while(num > 0 ){
          int rem = num % 2;
          rv = rv + (rem*pow);
          pow = pow * 10;
          num = num / 2;
      }
      return rv;
 }

}