package org.algo.dp.slidingwindow.patterns;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberInWindow {
  public static void main(String[] args) {
    FirstNegativeNumberInWindow solution = new FirstNegativeNumberInWindow();
    solution.solutionEfficient(new int[]{12,-1,-7,8,-15,30,16,28},3);
  }

  public void solutionEfficient(int array[],int k){
      int i=0,j=0;
      List<Integer> elements = new ArrayList<>();
      while(j<array.length){
          //temp solution
          if(array[j]<0){
              elements.add(array[j]);
          }
          //slide window until it reaches the size
          if(j-i+1<k){
              j++;
          }
          //find answer from temp solution.
          else if(j-i+1==k){
              if(elements.size()==0){
                System.out.println(0);
              }else{
                System.out.println(elements.get(0));
                if(elements.get(0)==array[i]){
                    elements.remove(0);
                }
              }
              i++;
              j++;
          }
      }

  }
}
