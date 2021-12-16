package String;

import java.util.*;

public class stringwithdiffofconsectuive {

	public static String solution(String str){
		// write your code here
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++){
            sb.append(str.charAt(i) - str.charAt(i-1));
			sb.append(str.charAt(i));
            
        }

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
        scn.close();
		System.out.println(solution(str));
	}

}