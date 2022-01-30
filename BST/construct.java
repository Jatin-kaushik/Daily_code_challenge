package BST;

import java.util.Scanner;


public class construct {

    public static class Node{
        int data;
        Node left;
        Node right;
    }

    public static void display(Node node){
        if(node == null){
            return;
        }
        String str = " <- " + node.data + " -> ";
        String lcstr = node.left == null? "." : node.left.data + "";
        String rcstr = node.right == null? "." : node.right.data + "";
        System.out.println(lcstr + str +rcstr);
        
        display(node.left);
        display(node.right);

    }

    public static Node constructbst(Integer[] arr, int lo, int hi){
        if (lo > hi){
            return null;
        }
        int mid = (lo+hi)/2;
        Node node = new Node();
        node.data = arr[mid];
        node.left = constructbst(arr, lo, mid-1);
        node.right = constructbst(arr, mid+1, hi);

        return node;
    }

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String[] values = scn.nextLine().split(" ");
        Integer[] arr = new Integer[n];
        scn.close();
        for (int i = 0; i<n; i++){
            if (values[i].equals("n") == false){
                arr[i] = Integer.parseInt(values[i]);
            }
            else {
                arr[i] = null;
            }
        }
        Node root = constructbst(arr, 0, arr.length -1);
        display(root);

    }
}
