package Generic_Tree;

import java.util.Scanner;

public class fib {

    public static int fibo(int n){
        if (n <=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int res = fibo(n);
        System.out.println(res);
    }
}
