package ArrayList;

import java.util.*;

public class removeallprime {
    public static boolean isprime(int number){
        boolean flag = true;
        for (int div = 2; div*div<=number; div++){
            if (number % div == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

	public static void solution(ArrayList<Integer> al){
		// write your code here
        for(int i = 0; i < al.size(); i++){
            if(isprime(al.get(i)) == true){
                al.remove(i);
                i--;
            }
        }

		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
        scn.close();
		solution(al);
		System.out.println(al);
	}

}