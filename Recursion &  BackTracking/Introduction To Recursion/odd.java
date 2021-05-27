
public class odd {
    public static void main(String[] args) {
        int n = 20;
        printodd(n);
    }

    public static void printodd(int n){
       if(n <= 0){
           return;
       }
       if(n % 2 == 0){
            printodd(n-1);
       }
       else{
       printodd(n-2);
       System.out.println(n);
    }
}
}
