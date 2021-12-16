package String;

public class stringvsstringbuilder {
    public static void main(String [] args){
        // Scanner scn = new Scanner(System.in);
        Long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i <100000; i++){ //this loop is on2 bcz of immuatabilty
            s = s + i;
        }
        Long end = System.currentTimeMillis();
        Long duration = end -start;
        System.out.println("Time duration of 1lakh iteration of a string " + duration); // 12755 ms 

        // String builder it's a mutable string
        Long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <100000; i++){ //this loop is on2 bcz of immuatabilty
            sb.append(i); // add ni hota isme
        }
        Long end1 = System.currentTimeMillis();
        Long duration1 = end1 -start1;
        System.out.println("Time duration of 1lakh iteration of a string builder is " + duration1); // 6 ms 
    }
}
