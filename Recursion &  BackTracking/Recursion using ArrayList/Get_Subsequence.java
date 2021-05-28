// Get Subsequence of a String using Recursion

import java.io.*;
import java.util.*;

public class Get_Subsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(gss(str));

    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> rres = gss(ros);

        for (String s : rres) {
            myList.add(s);
        }

        for (String s : rres) {
            myList.add(ch + s);
        }
        return myList;
    }

}