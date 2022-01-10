package Generic_Tree;

import java.util.*;


public class findpath {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        private static class Node {
            int data;
            ArrayList<Node> children = new ArrayList<>();
          }
        
          public static void display(Node node) {
        …    Node root = construct(arr);
            ArrayList<Integer> path = nodeToRootPath(root, data);
            System.out.println(path);
            // display(root);
          }
        
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
                cres.add(root.data);
                return cres;
            }
        }
        return new ArrayList<>();
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = scn.nextInt();
        }
        int data =scn.nextInt();
        scn.close();
        Node root = construct(arr);
        ArrayList<Integer> res = findpathtoroot(root, data);
        System.out.println(res);
    }
}
