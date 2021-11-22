import java.util.Scanner;

public class insertion_sort{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter size of the Array ");
        int n = scn.nextInt(); 
        int [] arr = new int [n];
        System.out.println("Please enter elements of Array ");
        for (int i = 0; i< n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        insertionsort(arr);
    }

    public static void insertionsort(int [] arr){
        for (int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println("Sorted Insertion array ");
        for (int i = 0; i<arr.length; i++){ // printing array
            System.out.println(arr[i]);
        }
    }
}