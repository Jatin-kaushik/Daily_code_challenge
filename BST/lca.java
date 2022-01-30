package BST;

import java.io.*;
import java.util.*;

public class lca {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static ArrayList<Integer> nodetoroot(Node node, int d){
    ArrayList<Integer> al = new ArrayList<>();
    while(node != null)
      if (d == node.data){
        al.add(d);
        break;}

      else if (node.data > d){
        al.add(node.data);
        node = node.left;
      }
      else{
        al.add(node.data);
        node = node.right;
      }
    if (al.get(al.size() -1 ) == d){
      return al;
    }
    else return new ArrayList<>();
  }
  public static int lca(Node node, int d1, int d2) {
    // write your code here
    ArrayList<Integer> res1 = nodetoroot(node, d1);
    ArrayList<Integer> res2 = nodetoroot(node, d2);
    System.out.println(res1 + " " + res2);
    int result = -1;
    if (res1.size() >= res2.size()){
      for (int i =0 ; i< res2.size(); i++){
        if (res1.get(i) != res2.get(i)){
          result = res1.get(i-1);
          break;
        }
      }
    }
    else{
      for (int i =0 ; i< res1.size(); i++){
        if (res1.get(i) != res2.get(i)){
          result = res1.get(i-1);
          break;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    int d1 = Integer.parseInt(br.readLine());
    int d2 = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    int lca = lca(root, d1, d2);
    System.out.println(lca);
  }

}