package com.grokking;

public class RecursiveSum {

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        RecursiveSum recursiveSum = new RecursiveSum();
        int x = recursiveSum.recursiveSum(array, array.length-1);
        System.out.println(x);
    }

    public int recursiveSum(int[] array, int n) {

        if(n == 0) {
            return array[0];
        }

        return array[n] + recursiveSum(array, n-1);

    }

}
