package com.algorithms.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {10,8,100,3,5,2,1,10};

        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.bubbleSort(array);
        int[] sortedUsingWhileLoop = bubbleSort.bubbleSortUsingWhileLoop(array);

        for(int i=0; i<sorted.length;i++) {
            System.out.println(sorted[i]);
        }

        for(int i=0; i<sortedUsingWhileLoop.length;i++) {
            System.out.println(sortedUsingWhileLoop[i]);
        }

    }

    public int[] bubbleSort(int[] array) {

        int temp=0;

        for(int i =0; i<array.length;i++) {

            for(int j=1; j<array.length-i;j++) {

                if(array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }

            }

        }

        return array;
    }

    public int[] bubbleSortUsingWhileLoop(int[] array) {

        boolean sorted = false;
        int temp = 0;
        while(!sorted) {

            sorted = true;
            for(int i = 0; i<array.length-1;i++) {
                if(array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted=false;
                }
            }

        }

        return array;

    }

}
