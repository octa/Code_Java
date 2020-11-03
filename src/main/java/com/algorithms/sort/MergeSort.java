package com.algorithms.sort;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {10,8,100,3,5,2,1,10};
        MergeSort mergeSort = new MergeSort();
        mergeSort(array, array.length);

        for(int i=0; i< array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void mergeSort(int[] array, int n) {

        if( n < 2) return;

        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i=0; i< mid; i++) {
            left[i] = array[i];
        }

        for(int j=mid; j<n; j++) {
            right[j-mid] = array[j];
        }

        mergeSort(left, mid); // Recurive method to split the left side.
        mergeSort(right, n-mid); // Recurive method to split the right side.

        merge(array, left, right, mid, n-mid);

    }

    public static void merge(int array[], int left[], int[] right, int ln, int rn) {

        int i, j, k; // i is the pointer for the left side. j is the pointer for ths right side. k is the pointer for the sorted array.
        i=j=k=0;

        while(i < ln && j < rn) {
            if(left[i] <= right[j]) { // compare and add first if the smallest is in the left array
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++]; // compare and add first if the smallest is in the right array
            }
        }

        while(i < ln) {
            array[k++] = left[i++]; // copy left over elements from left array
        }

        while(j < rn) {
            array[k++] = right[j++]; // copy left over elements from right array
        }

    }
}
