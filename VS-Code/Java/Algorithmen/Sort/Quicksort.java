package Java.Algorithmen.Sort;
import Java.Algorithmen.Help.HelpMethods;

class Quicksort {
    public static void main(String[] args) {
        int[] arr = {40, 20, 7, 80, 60, 50, 10, 30, 17, 42};
        HelpMethods.printArray(arr);
        quicksort(arr, 0, arr.length-1);
        System.out.println("--------------------------------------------------------");
        HelpMethods.printArray(arr);
    }

    // Quicksort-Methode:
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

            while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;   
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer) {
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