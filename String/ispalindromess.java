package String;

import java.util.*;

public class ispalindromess {

	public static void solution(String str){
		//write your code here
        for(int i = 0; i< str.length(); i++){
            for(int j = i; j<str.length(); j++){
                String ss = str.substring(i, j+1);
                // System.out.println(ss);
                Boolean res = checkpalindrome(ss);
                if (res == true) System.out.println(ss);
            }
        }
	}

    public static boolean checkpalindrome(String str){
        Boolean ispali = true;
        int left = 0;
        int right = str.length() -1;
        while(left<right){
            if (str.charAt(left) != str.charAt(right)){
                ispali = false;
                return ispali;
            }
            left++;
            right--;
        }
        return ispali;
    }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
        scn.close();
		solution(str);
	}

}