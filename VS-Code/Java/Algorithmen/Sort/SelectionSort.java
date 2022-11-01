package Java.Algorithmen.Sort;

import Java.Algorithmen.Help.HelpMethods;

// Seite 177 im Skript!

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {40, 20, 7, 80, 60, 50, 10, 30, 17, 42};
        HelpMethods.printArray(arr);
        System.out.println("-------------------");
        selectionSort(arr);
        HelpMethods.printArray(arr);
    }

    private static void selectionSort(int[] arr) {
        for(int i=0; i < arr.length-1; i++) {   // Durchlaufen des Arrays
            int minElementIndex = i;            // Momentan "kleinstes" Element
            for(int j=i+1; j < arr.length; j++) {
                if(arr[j] < arr[minElementIndex]) {     // Vergleich ob Array am Index j kleiner als das Array am Index minElementIndex ist
                    minElementIndex = j;                // Falls ja wird dieses das neue kleinste Element
                }
            }
            HelpMethods.swap(arr, i, minElementIndex);  // Das aktuell kleinste Element wird dem aktuellen index i getauscht!
        }
    }
}