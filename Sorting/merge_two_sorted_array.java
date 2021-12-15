package Sorting;
import java.util.Scanner;

public class merge_two_sorted_array {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] arr1 = new int[n1];
        for (int i=0; i<n1; i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int [] arr2 = new int[n2];
        for(int i =0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }
        scn.close();
        merge_array(arr1, arr2);
    } 

    public static void merge_array(int [] arr1, int [] arr2){
        int i =0;
        int j = 0;
        int k = 0;
        int [] res = new int [arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
                k++; 
            }
            else{
                res[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(i == arr1.length){
            while(j != arr2.length){
                res[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(j == arr2.length){
            while(i!=arr1.length){
                res[k] = arr1[i];
                i++;
                k++;
            } 
        }

        System.out.print("Merged Two Sorted Array : ");
        for (int p = 0 ; p <res.length; p++){
            System.out.print(res[p] + "  ");
        }
    }  
}
