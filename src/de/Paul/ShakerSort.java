package de.Paul;

public class ShakerSort {

    /**
     * Sortiert das uebergebene Arrayv.
     * @param arr Das zu sortierende Array
     */
    public static void sort(int[] arr) {

        /*
        Integer Memory dient als Zwischenspeicher zum tauschen der Felder im Array
        Integer counterRight, am Anfang 0, gibt den Abstand zur rechten Seite (Ende) an, wenn der bereich dort schon Sortiert ist
        Integer counterLeft, am Anfang 1, gibt den Abstand zur linken Seite an, wenn der bereich dort schon Sortiert ist
         */

        int memory, counterLeft = 1, counterRight = 0;

        //Äußere for-Schleife, durchläuft einmal den Array
        for (int i = 0; i < arr.length - 1; i++) {

            /*
            Erste innere Schleife:
            Durchläuft den Array von der Stelle bis zu der von Links Sortiert wurde, bis zu der rechts Sortiert wurde
            Schiebt das größte Element nach Rechts
             */
            for (int j = counterLeft; j < ((arr.length - 1) - counterRight); j++) {
                if(arr[j] > arr[j+1]) {
                    memory = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = memory;
                }
            }
            counterRight++;

            /*
            Zweite innere Schleife:
            Durchläuft den Array von der Stelle recht im unsortierten bereich bis zur linkesten Stelle des unsortierten Bereichs
            Schiebt das kleinste Element nach links
             */
            for (int j = ((arr.length - 1) - counterRight); j >= counterLeft; j--) {
                if(arr[j] < arr[j-1]) {
                    memory = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = memory;
                }
            }
            counterLeft++;

        }
    }


}
