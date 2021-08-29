// Get Stair Paths

            // Reactive Approach


    // public static ArrayList<String> getStairPaths(int n) {
    
    // if(n == 0){
    //     ArrayList<String> base = new ArrayList<>();
    //     base.add("");
    //     return base;
    // }
    
    // if(n < 0){
    //     ArrayList<String> base = new ArrayList<>();
    //     return base;
    // }
    
    // ArrayList<String> path1Len = getStairPaths(n-1);
    
    // ArrayList<String> path2Len = getStairPaths(n-2);
    
    // ArrayList<String> path3Len = getStairPaths(n-3);
    
    // ArrayList<String> myList = new ArrayList<>();
    
    // for(String s : path1Len){
    // myList.add("1"+ s);    
    // }
    
    // for(String s : path2Len){
    // myList.add("2"+ s);    
    // }
    
    // for(String s : path3Len){
    // myList.add("3"+ s);    
    // }
    
    // return myList;
    
    // }


// Pro-Active Approach
import java.io.*;
import java.util.*;

public class Get_Stair_Paths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myList = new ArrayList<>();
        if (n >= 1) {
            ArrayList<String> path1Len = getStairPaths(n - 1);
            for (String s : path1Len) {
                myList.add("1" + s);
            }
        }

        if (n >= 2) {
            ArrayList<String> path2Len = getStairPaths(n - 2);
            for (String s : path2Len) {
                myList.add("2" + s);
            }
        }

        if (n >= 3) {
            ArrayList<String> path3Len = getStairPaths(n - 3);
            for (String s : path3Len) {
                myList.add("3" + s);
            }

        }
        return myList;

    }

}
