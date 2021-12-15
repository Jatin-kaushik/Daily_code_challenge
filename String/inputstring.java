package String;

import java.util.Scanner;

public class inputstring {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        // String str = scn.nextLine();// Ye poori line read krta h 
        String str = scn.next();// ye space tk read krta h
        scn.close();
        System.out.println(str);
    }
}
