package Binary_tree;

import java.util.Scanner;
import java.util.Stack;


public class binarytree {

    public static class Node{
        String data;
        Node left;
        Node right;
    }

    public static class Pair{
        Node node;
        int state;
    }

    public static Node construct(int [] arr){
    Stack<Pair> stack = new Stack<>();
    Node root = new Node();
    root.data = arr[0];

    Pair rootp = new Pair();
    rootp.node =root;
    rootp.state = 1;

    int idx = 1;
    stack.push(rootp);

    while(stack.size() >0){
        Pair p = stack.peek();
        if (p.state == 1){
            if( arr[idx] != null ){
                Node node = new Node();
                node.data = arr[idx];

                p.node.left = node;
                Pair lp = new Pair();
                lp.node = node;
                lp.state = 1;
                stack.push(lp);
            }
            idx++;
            p.state++;
        }

        else if (p.state ==2){
            if( arr[idx] != null ){
                Node node = new Node();
                node.data = arr[idx];

                p.node.right = node;
                Pair rp = new Pair();
                rp.node = node;
                rp.state = 1;
                stack.push(rp);
            }
            idx++;
            p.state++;
        }

        else if (p.state == 3){
            stack.pop();
        }
    }
    return root;

    }

    public static void display(Node root){
        if (root == null){
            return;
        }
        String str = " <- " +root.data + " -> ";
        String lcstr = root.left == null? "." : root.left.data;
        String rcstr = root.right == null? ".": root.right.data;
        System.out.println(lcstr + str + rcstr);
        display(root.left);
        display(root.right);

    }

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0; i <n ; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        Node root = construct(arr);
        display(root);
    }
}
