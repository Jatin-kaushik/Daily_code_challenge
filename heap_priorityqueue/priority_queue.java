package heap_priorityqueue;

import java.io.*;
import java.util.*;

public class priority_queue {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    void swap(int i, int j){
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i, jth);
        data.set(j, ith);
    }
    
    void upheapify(int idx){
        if (idx == 0){
            return;
        }
        int pi = (idx -1)/2;
        if (data.get(idx) < data.get(pi)){
            swap(idx, pi);
            upheapify(pi);
        }
    }

    public void add(int val) {
      data.add(val);
      upheapify(data.size()-1);
    }

    void downheapify(int i){
        int mini = i;
        int lci = 2*i + 1;
        int rci = 2*i + 2;

        if (lci < data.size() && data.get(lci) < data.get(mini)){
            mini = lci;
        }
        if (rci < data.size() && data.get(rci) < data.get(mini)){
            mini = rci;
        }

        if (mini != i){
            swap(i, mini);
            downheapify(mini);
        }

    }

    public int remove() {
      // write your code here
      if(data.size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      int last = data.size() -1;
      swap(0, last);
      int val = data.remove(last);
      downheapify(0);
      return val;

    }

    public int peek() {
      // write your code here
      if(data.size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      return data.get(0);
    }

    public int size() {
      // write your code here
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}