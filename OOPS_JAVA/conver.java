package OOPS_JAVA;

import java.util.Scanner;

public class conver {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        scn.close();
        System.out.println(a + a.getClass().getSimpleName());
    }
}
