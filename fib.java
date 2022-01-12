

import java.util.Scanner;

public class fib {

    static int ans  = 1;

    public static void fibo(int n){
        if (n <=1){
            return;
        }
        ans = ans *n;
        fibo(n-1);
    }

    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        fibo(n);
        System.out.println("Fibonnaci of " + n + " is " + ans);
    }
}
