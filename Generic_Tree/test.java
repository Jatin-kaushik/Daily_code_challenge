package Generic_Tree;

import java.util.*;

public class test {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        private Node(int data){
            this.data = data;
        }
    }

    public static Node construct(int [] arr){
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for(int val : arr){
            if(val!= -1){
                stack.push(new Node(val));
            }
            else{
                Node node = stack.pop();
                if(stack.size() >0){
                    stack.peek().children.add(node);
                }
                else  root = node;
            }
        }
        return root;
    }

    public static Boolean aresimilar(Node root1, Node root2){
        if(root1.children.size() != root2.children.size()){
            return false;
        }

        for(int i = 0 ; i<root1.children.size(); i++){
            Node c1 = root1.children.get(i);
            Node c2 = root2.children.get(i);

            if (aresimilar(c1, c2) == false){
                return false;
            }
        }
        return true;
    }


    public static Boolean areMirror(Node root1, Node root2){
        if(root1.children.size() != root2.children.size()){
            return false;
        }
        for(int i = 0; i<root1.children.size(); i++){
            Node c1 = root1.children.get(i);
            Node c2 = root2.children.get(root2.children.size()-1-i);
            if(areMirror(c1, c2) == false){
                return false;
            }
        }
        return true;
    }

    public static Boolean isSymmetric(Node root){
        return areMirror(root, root);
    }

    public static void main(System [] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] arr1 = new int[n1];
        for(int i = 0; i<n1 ;i++){
            arr1[i] = scn.nextInt();
        }
        scn.close();
        Node root = construct(arr1);
        boolean res = isSymmetric(root);
        System.out.println(res);
     }
}
