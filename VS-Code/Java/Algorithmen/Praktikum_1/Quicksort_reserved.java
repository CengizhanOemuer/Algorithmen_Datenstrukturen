package Java.Algorithmen.Praktikum_1;

public class Quicksort_reserved {
    public static void main(String[] args) {
        int[] arr = {40, 20, 7, 80, 60, 50, 10, 30, 17, 42};
        printArray(arr);
        quicksort(arr, 0, arr.length-1);
        System.out.println("--------------------------------------------------------");
        printArray(arr);
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
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        // Rekursiveraufruf:
        quicksort(arr, lowIndex, leftPointer - 1);
        quicksort(arr, leftPointer + 1, highIndex);
    }

    // Swap-Methode:
    private static void swap(int[] arr, int i, int j) {
        int help = arr[i];
        arr[i] = arr[j];
        arr[j] = help;
    }

    // Array ausgeben:
    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "] = " + arr[i]);
        }
    }
}
