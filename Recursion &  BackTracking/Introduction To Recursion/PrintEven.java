// Print Even numbers
import java.io.*;
import java.util.*;

public class PrintEven {
    public static void main(String[] args) {
        int n = 18;
        printeven(n);
    }
    public static void printeven(int n){
        if(n < 0){
            return ;
        }
        if(n % 2 != 0){
            printeven(n-1);
        }
        else {
            System.out.println(n);
            printeven(n-2);
        }
    }
}
