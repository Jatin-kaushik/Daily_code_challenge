import java.util.Scanner;

public class Any_base_to_decimal {
    public static void main(String [] args){
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        int conv_num = getValueIndecimal(n,b);
        System.out.println(conv_num);       
    }
    public static int getValueIndecimal(int num, int base){
        int pow  = 1; // base ki power 0
        int ans = 0;
        while (num>0){
            int rem = num%10;
            num = num/10;
            ans += rem*pow;
            pow*=base;
            }
        return ans;
    }
}