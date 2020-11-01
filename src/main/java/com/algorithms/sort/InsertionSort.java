package com.algorithms.sort;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {10,8,100,3,5,2,1,10};
        InsertionSort insertionSort = new InsertionSort();
        int[] sorted = insertionSort.insertionSort(array);

        for(int i=0; i<sorted.length;i++) {
            System.out.println(sorted[i]);
        }

    }

    public int[] insertionSort(int[] array) {

        int key = 0;
        int indexOfElementsInSortedArray = 0;

        for(int i=0; i<array.length;i++) {

            key = array[i];
            indexOfElementsInSortedArray = i-1;

            while(indexOfElementsInSortedArray >=0 && array[indexOfElementsInSortedArray] > key) {

                array[indexOfElementsInSortedArray+1] = array[indexOfElementsInSortedArray];
                //array[indexOfElementsInSortedArray] = key; - // Another way of writing but takes more space because of the extra swaps. Dont really need to swap every element. Use array[indexOfElementsInSortedArray+1] = key; outside the while loop to move the lower number finally at the end of the iteration.
                indexOfElementsInSortedArray = indexOfElementsInSortedArray-1;

            }

            array[indexOfElementsInSortedArray+1] = key; //array[indexOfElementsInSortedArray+1] because of indexOfElementsInSortedArray = indexOfElementsInSortedArray-1; since this will decrement 1 but the element has to be placed 1 index above.

        }

        return array;
    }
}
