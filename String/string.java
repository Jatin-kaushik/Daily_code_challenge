package String;
// Immutable Dtype Object
public class string {
    public static void main(String [] args){
        String str = "Hello";
        for(int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        // str[0] = "b"; // Not possible we can't change string directly 
        str += " World!";
        System.out.println(str);
        System.out.println(10 +20 + "Hello" + 10 +20); // Left ro right chalega apne hisab se dtype change krlega
        // output 30hello1020

        // substring
        System.out.println(str.substring(1,3));
    } 
}
