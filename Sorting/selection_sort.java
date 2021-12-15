package Sorting;
// in every iteration we are focusing upon minimum element in rem. unsorted array and swapping with iteration number

import java.util.*;

public class selection_sort {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter size of the Array ");
        int n = scn.nextInt(); 
        int [] arr = new int [n];
        System.out.println("Please enter elements of Array ");
        for (int i = 0; i< n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        selectionsort(arr);
    }

    public static void selectionsort(int [] arr){
        for (int i = 0; i <arr.length -1; i++){
            int minidx = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[minidx] > arr[j]){
                    minidx = j;
                }
            }
            if (minidx != i){
                int temp = arr[i];
                arr[i] = arr[minidx];
                arr[minidx] = temp;
            }           
        }
        System.out.println("Selection Sorted array ");
        for (int i = 0; i<arr.length; i++){ // printing array
            System.out.println(arr[i]);
        }
    }
}