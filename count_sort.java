import java.util.Scanner;
//
public class count_sort {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for (int i = 0 ; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        countsort(arr);
        // display(arr);
    }

    public static void countsort(int [] arr){
        //step 1 range nikalo
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY; 
        for (int i = 0; i< arr.length; i++){
            if (arr[i] < min){
                min  = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }
        int range = (int)max - (int)min +1;
        
        
        // step 2 ab freq array bnao
        int [] farr = new int[range];
        for (int i = 0; i <arr.length; i++){
            farr[arr[i] - (int)min] +=1;
        }


        // step 3 psa bnao (running sum array)
        int [] psa = new int[range];
        psa[0] = farr[0];
        for(int i =1; i <psa.length; i++){
            psa[i] = farr[i] + psa[i-1];
        }


        // step4 ab psa and orig array ki help se ans array bnaao
        int [] res= new int[arr.length];
        for (int i = arr.length -1; i>=0; i--){ // ab last se start krenge 
            int ele = arr[i]; // last element niakle uski range min ki help se psa ka index dhudho
            // System.out.println("ele " + ele);
            int psa_idx = ele-(int) min;
            // System.out.println("index in psa "+ psa_idx);
            int stableposition = psa[psa_idx]; // psa ki help se last element ka stable sorted index nikalo and bhr do
            // System.out.println("Stable position in array "+stableposition);
            res[stableposition-1] = ele; 
            // System.out.println("ans in result array " +res[stableposition-1]);
            psa[psa_idx]--; // last me psa ko update kro
            // System.out.println("running sum of the ele is " +psa[psa_idx]);
            // System.out.println(ele + ", " +  psa_idx + ", " +stableposition+ ", " +res[stableposition-1]+ ", " +psa[psa_idx]);
        }

        for (int i = 0; i <res.length; i++){
            System.out.println(res[i]);
        }
    }
    
}
