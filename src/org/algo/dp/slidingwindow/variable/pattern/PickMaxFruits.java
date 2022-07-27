package org.algo.dp.slidingwindow.variable.pattern;

import java.util.HashMap;
import java.util.Map;

public class PickMaxFruits {
    public static void main(String[] args) {
    PickMaxFruits maxFruits = new PickMaxFruits();
        //System.out.println(maxFruits.maxFruits(new int[]{1,2,1}));
        //System.out.println(maxFruits.maxFruits(new int[]{0,1,2,2}));
        //System.out.println(maxFruits.maxFruits(new int[]{1,2,3,2,2}));
        System.out.println(maxFruits.maxFruits(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }

    public int maxFruits(int fruits[]){
        int maxPicks =2;
        Map<Integer,Integer> picks = new HashMap<>();
        int i=0,j=0,max=0;

        while (j<fruits.length){
            int currentType = fruits[j];
            if(picks.containsKey(currentType)){
                picks.put(currentType,picks.get(currentType)+1);
            }else{
                picks.put(currentType,1);
            }

            if(picks.size()<=maxPicks){
                max = Math.max(max, j - i + 1);
                j++;
            }else if(picks.size() > maxPicks){
                while (picks.size()>maxPicks){
                    int firstPick = fruits[i];
                    picks.put(firstPick,picks.get(firstPick)-1);
                    if(picks.get(firstPick)==0){
                        picks.remove(firstPick);
                    }
                    i++;
                }
                j++;
            }
        }

        return  max;
    }
}
