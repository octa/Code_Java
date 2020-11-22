package com.algorithms.search;

import com.algorithms.sort.BubbleSort;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int key = 1;

        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.binarySearchRecursion(array, key, 0, array.length);

        System.out.println("Found element at index " + index);

    }

    public int binarySearch(int[] array, int key, int low, int high) {

        int index = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = (low+high)/2;

            if(mid >= array.length) {
                return index;
            }

            if(array[mid]==key) {
                index = mid;
                break;
            }
            else if(key < array[mid]) {
                high = mid-1;
            }
            else if(key > array[mid]) {
                low = mid+1;
            }
        }

        return index;

    }

    public int binarySearchRecursion(int[] array, int key, int low, int high) {

        int mid = (low+high)/2;

        if(high < low || mid >= array.length) {
            return Integer.MAX_VALUE;
        }

        if(array[mid] == key) {
            return mid;
        }
        else if(key < array[mid]) {
            return binarySearchRecursion(array, key, low, mid-1);
        }
        else {
            return binarySearchRecursion(array, key, mid+1, high);
        }

    }

}
