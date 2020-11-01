package com.algorithms.sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {10,8,100,3,5,2,1,10};
        SelectionSort selectionSort = new SelectionSort();
        int[] sorted = selectionSort.selectionSort(array);

        for(int i=0; i<sorted.length;i++) {
            System.out.println(sorted[i]);
        }

    }

    public int[] selectionSort(int[] array) {

        int min=0;
        int temp=0;
        for(int i=0; i<array.length;i++) {

            min = i;
            for(int j=i+1; j<array.length;j++) {

                if(array[min] > array[j]) {
                    min = j;
                }

            }
            if(min!=i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

        }


        return array;
    }

}
