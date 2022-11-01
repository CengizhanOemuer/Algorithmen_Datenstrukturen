package Java.Algorithmen.Praktikum_1;

import Java.Algorithmen.Help.HelpMethods;

public class Quicksort_reserved {
    public static void main(String[] args) {
        int[] arr = {40, 20, 7, 80, 60, 50, 10, 30, 17, 42};
        HelpMethods.printArray(arr);
        quicksort(arr, 0, arr.length-1);
        System.out.println("--------------------------------------------------------");
        HelpMethods.printArray(arr);
    }

    private static void quicksort(int[] arr, int lowIndex, int highIndex) {

        // Rekursionsanker:
        if(lowIndex >= highIndex)
            return;

        // Festlegen des Pivots:
        int pivot = arr[highIndex];
        // Pointer erzeugen:
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while(arr[leftPointer] >= pivot && leftPointer < rightPointer) {    // Vertausche das >= Zeichen um die Reihenfolge zu drehen!
                leftPointer++;   
            }
            while(arr[rightPointer] <= pivot && leftPointer < rightPointer) {   // Vertausche das <= Zeichen um die Reihenfolge zu drehen!
                rightPointer--;
            }
            HelpMethods.swap(arr, leftPointer, rightPointer);
        }
        HelpMethods.swap(arr, leftPointer, highIndex);

        // Rekursiveraufruf:
        quicksort(arr, lowIndex, leftPointer - 1);
        quicksort(arr, leftPointer + 1, highIndex);
    }
}
