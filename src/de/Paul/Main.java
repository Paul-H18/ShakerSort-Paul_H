package de.Paul;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[12];

        ArrayOperations.randArray(arr, 28);

        ArrayOperations.printArray(arr);
        ShakerSort.sort(arr);
        ArrayOperations.printArray(arr);
    }
}
