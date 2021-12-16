package String;

import java.util.*;
//Ascii : A-65,  Z-90, a-97, z-122
public class togglecaseasciimethod {
    public static String togglecase(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char lc = (char)(ch + ('a'-'A'));
                sb.setCharAt(i, lc);
            }
            else{
                char uc = (char)(ch + ('A' - 'a'));
                sb.setCharAt(i, uc);
            }
        }
        return sb.toString();
    }

    // formula to change : c-a = C-A
    // i.e; c= C + (a-A) and C = c + (A-a)
    //  LC = UC +(a-A) and UC = LC + (A-a)

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println(togglecase(str));
    }
}
