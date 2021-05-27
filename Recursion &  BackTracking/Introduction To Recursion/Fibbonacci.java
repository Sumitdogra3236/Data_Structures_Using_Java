import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibbonacci(n));
        
    }
    public static int fibbonacci(int n){
        if(n == 1 ){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        int fibNm1 = fibbonacci(n-1);
        int fibNm2 = fibbonacci(n-2);
        int fibN = fibNm1 + fibNm2;
        return fibN;
    }
}