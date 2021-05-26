
// add(val) --> add element at the ends
// add(index, element) --> add element at the given index
// remove(idx) --> remove element accroding to index
// get(idx) --> gets value of idx
// set(idx, valie) --> update value at the idx of list

// list.size() --> gives the size of the ArrayList

import java.util.ArrayList;
public class ArrayList_Intro {
 public static void main(String[] args) {
//  ArrayList<Float> list = new ArrayList<>();   // --> decleration of float type ArrayList
    // ArrayList<Boolean> list = new ArrayList<>(); // --> decleration of boolean type Arraylist
    ArrayList <Integer> list = new ArrayList<>();
    System.out.println(list);
    System.out.println(list);

  list.add(10);
  list.add(20);
  list.add(30);
  list.add(-40);
  
  System.out.println(list);
  System.out.println("----------------");
    
    System.out.println(list.get(0));

    list.remove(0);
    
    list.set(1, 100);
    System.out.println(list);

    for(int val : list){
        System.out.print(val + " ");
    }
 }
    
}
