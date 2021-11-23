import java.util.Scanner;

public class Sort01 {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        sort(arr);
        print(arr);
     }

    public static void sort(int [] arr){
        int i = 0;
        int j = 0;
        while(i<arr.length){
            if (arr[i] == 1){
                i++;
            }
            else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }
    public static void swap(int [] arr, int i, int j){
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void print(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
