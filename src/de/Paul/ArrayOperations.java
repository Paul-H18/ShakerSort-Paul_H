package de.Paul;

import java.util.Random;

public class ArrayOperations {


    /**
     * Gibt ein Array aus
     * @param arr Das auszugebende Array
     */
    public static void printArray(int[] arr) {
        for(int i = 0; i<= arr.length - 1; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.print("\n\n");
    }


    /**
     * Befuellt ein Array komplett mit Zufalsszahlen
     * @param arr Das zu befuellende Array
     * @param max Maximalhoehe der Zufallswerte
     */
    public static void randArray(int[] arr, int max) {
        Random rand = new Random();

        for(int i = 0; i<= arr.length - 1; i++) {
            arr[i] = rand.nextInt(max);
        }
    }

    /**
     * Kopiert ein Array in zwei andere Arrays
     * @param startArr Das Array, das kopiert werden soll
     * @param arr0 Das zu befuellende Array 1
     * @param arr1 Das zu befuellende Array 2
     */
    public static void copyArrays(int[]startArr, int[] arr0, int[] arr1) {
        int x = startArr.length;

        System.arraycopy(startArr, 0, arr0, 0, x);
        System.arraycopy(startArr, 0, arr1, 0, x);
    }
}
