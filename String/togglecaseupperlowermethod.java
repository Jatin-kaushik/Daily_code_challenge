package String;

import java.util.Scanner;

public class togglecaseupperlowermethod {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == Character.toLowerCase(str.charAt(i))){
                res+=Character.toUpperCase(str.charAt(i));
            }
            else{
                res+=Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(res); 
    }
}
