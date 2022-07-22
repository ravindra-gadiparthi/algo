package org.algo.dp.slidingwindow.patterns;

import java.util.ArrayList;
import java.util.Iterator;

public class MaxElementInSubArray {
  public static void main(String[] args) {
    MaxElementInSubArray solution = new MaxElementInSubArray();
    solution.printMaxElementsInSubArray(new int[]{1,3,-1,-3,5,3,6,7},3);
  }

  public void printMaxElementsInSubArray(int array[],int k){
    ArrayList<Integer> list = new ArrayList<>();

    //init
    int i=0,j=0;

    //iterate through elements
    while(j<array.length){

      // temp calculation
      list.add(array[j]);
      Iterator<Integer> iterator = list.iterator();
      //delete all elements less that array[j] so that your first element is max.
      while (iterator.hasNext()){
        if(iterator.next()<array[j]){
          iterator.remove();
        }
      }

      //slide until you reach window
      if(j-i+1<k){
        j++;
        //once you reach window calculate the answer
      }else if(j-i+1==k){
        System.out.println("Max value is "+list.get(0));

        //while sliding if first element is your max remove it from list
        if(list.get(0) == array[i]){
          list.remove(0);
        }
        i++;
        j++;
      }

    }
  }
}
