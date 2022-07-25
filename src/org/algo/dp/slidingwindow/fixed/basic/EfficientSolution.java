package org.algo.dp.slidingwindow.fixed.basic;

public class EfficientSolution {
    public static void main(String[] args) {
        EfficientSolution solution = new EfficientSolution();
        solution.maxSubArray(new int[]{2,3,5,2,9,7,1},3);
    }

    /**
     * Pattern template
     *
     * int =0 ,j=0;
     * while(j<0){
     *     apply logic to find out temp solution
     *     slide the window until it reaches size
     *     if(j-i+1 < k){
     *      j++
     *     }
     *     //logic when it reaches the window
     *     else if(j-i+1 == k){
     *     find out answer from temp solution
     *     //i++
     *     //j++
     *     }
     * }
     * @param array
     * @param size
     * @return
     */
    public int maxSubArray(int array[], int size) {
        int max = 0;
        int currentSum = 0;
        int j=0,i=0;
        while(j<array.length){
            currentSum+=array[j];
            if(j-i+1<size){
                j++;
            }else if(j-i+1==size){
                max = Math.max(max,currentSum);
                currentSum = currentSum - array[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
        return max;
    }
}
