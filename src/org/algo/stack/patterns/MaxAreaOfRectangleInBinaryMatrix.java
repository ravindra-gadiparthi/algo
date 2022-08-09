package org.algo.stack.patterns;

import java.util.Arrays;

public class MaxAreaOfRectangleInBinaryMatrix {
    public static void main(String[] args) {

        new MaxAreaOfRectangleInBinaryMatrix().solution(new int[][]{{0,1,1,0},{1,1,1,1},{1,1,1,1,},{1,1,0,0}});

    }

    public int solution(int matrix[][]){
        int currentMatrix[]=new int[matrix[0].length];
        Arrays.fill(currentMatrix,0);
        MaximumAreaHistogram histogram=new MaximumAreaHistogram();
        int maxArea = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    currentMatrix[j]=0;
                }else{
                    currentMatrix[j]=currentMatrix[j]+matrix[i][j];
                }
            }
            maxArea=Math.max(maxArea,histogram.solution(currentMatrix));
        }
        System.out.println(maxArea);
        return maxArea;
    }
}

