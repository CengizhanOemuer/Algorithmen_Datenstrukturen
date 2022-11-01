package Java.Algorithmen.Sort;

class Quicksort {
    public static void main(String[] args) {
        int[] arr = {40, 20, 7, 80, 60, 50, 10, 30, 17, 42};
        // Ausgabe:
        for(int i = 0; i < arr.length-1; i++) {
            System.out.println("Unsortiertes Array:" + arr[i]);
        }
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length-1; i++) {
            System.out.println("Sortiertes Array:" + arr[i]);
        }
    }

    // Methode zum vertauschen der Array-Elemente:
    static void swap(int[] arr, int i, int j) {
        int help = arr[i];
        arr[i] = arr[j];
        arr[j] = help;
    }
    // Methode zur Partionierung des Arrays:
    static int partition(int[] arr, int low, int high) {
        // Festlegen eines Pivots:
        int pivot = arr[high];
        //
        int i = (low-1);
        //
        for(int j = low; j <= high - 1; j++) {
            // Falls arr[j] kleiner als Pivot ist:
            if(arr[j] < pivot) {
                i++; // Erhöhe den Index vom kleineren Element!
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    // 
    static void quickSort(int[] arr, int low, int high) {
        
        if(low < high) {
            // pi steht für den Partionierungs Index
            int pi = partition(arr, low, high);

            // 
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1 , high);
        }
    }


}