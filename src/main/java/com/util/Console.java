package com.util;

public class Console {

    public static void log(int[] array) {

        for(int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void logln(int[] array) {

        for(int i=0; i<array.length;i++) {
            System.out.println(array[i]);
        }

    }

}
