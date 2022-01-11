package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Lca {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        
        public Node(int data){
            this.data = data;
        }
    }

    public static Node construct(int[] arr){
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for(int val : arr){
            if (val != -1){
                stack.push(new Node(val));
            }
            else{
                Node node = stack.pop();
                if(stack.size()>0){
                    stack.peek().children.add(node);
                }
                else root = node;
            }
        }
        return root;
    }

    public static ArrayList<Integer> findpathtoroot(Node root,  int data){
        if (root.data == data){
            ArrayList<Integer> res = new ArrayList<>();
            res.add(root.data);
            return res;
        }
        for(Node child : root.children){
            ArrayList<Integer> cres = findpathtoroot(child, data);
            if (cres.size() >0 ){
                cres.add(child.data);
                return cres;
            }
        }
        return new ArrayList<>();
    }

    public static int lcaoftree(Node root, int d1, int d2){
        ArrayList<Integer> al1 = findpathtoroot(root, d1);
        ArrayList<Integer> al2 = findpathtoroot(root, d2);
        int gap = 0;
        int ans = -1;
        if (al1.size()> al2.size()){
            gap = al1.size()-al2.size();
            for(int i = 0; i<al2.size(); i++){
                if(al2.get(i) == al1.get(gap)){
                    return ans = al2.get(i);
                }
                gap++;
            }
        }
        else if (al2.size()>al1.size()){
            gap = al2.size() - al1.size();
            for(int i = 0; i<al1.size(); i++){
                if(al1.get(i) == al2.get(gap)){
                    return ans = al1.get(i);
                }
                gap++;
            }
        }
        else{
            for(int i=0; i<al1.size(); i++){
                if(al1.get(i) == al2.get(i)){
                    return ans = al1.get(i);
                }
            }
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = scn.nextInt();
        }
        int data1 =scn.nextInt();
        int data2 =scn.nextInt();
        scn.close();
        Node root = construct(arr);
        int res = lcaoftree(root, data1, data2);
        System.out.println(res);
    }
}
