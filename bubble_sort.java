import java.util.*;

public class bubble_sort{
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
        bubblesort(arr);
    }

    public static void bubblesort(int [] arr){
        for (int i = 0; i < arr.length -1; i++){
            for (int j = i; j < arr.length; j++){ // we can fix any end for known elements, here i'm fixing starting pos. i.e; after every jump, 0 to i is sorted.
                if (arr[i] > arr[j]){ // asscending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array ");
        for (int i = 0; i<arr.length; i++){ // printing array
            System.out.println(arr[i]);
        }
    }
}