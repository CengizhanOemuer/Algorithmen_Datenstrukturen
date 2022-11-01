package Java.Algorithmen.Sort;

import Java.Algorithmen.Help.HelpMethods;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {40, 20, 7, 80, 60, 50, 10, 30, 17, 42};
        HelpMethods.printArray(arr);
        System.out.println("------------------------------");
        mergesort(arr);
        HelpMethods.printArray(arr);
    }

    // Recursive Mergesort:
    private static void mergesort(int [] arr) {
        // Sortieren des Arrays:
        int inputLength = arr.length;
        // Rekursionsanker:
        if(inputLength < 2) {
            return;
        }
        // Bestimmen der Mitte des Arrays:
        int midIndex = inputLength / 2;
        // Erzeugen zweier Arrays für die zwei Hälften:
        int[] leftHalf = new int[midIndex];
        int[] righthalf = new int[inputLength-midIndex];
        // Kopieren des Ursprünglichen Arrays in zwei hälften:
        for(int i=0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }
        for(int i=midIndex; i < inputLength; i++) {
            righthalf[i - midIndex] = arr[i];
        }
        // Rekursiveraufruf auf die jeweils zwei Hälften:
        mergesort(leftHalf);
        mergesort(righthalf);
        // Ab hier wird gemerged!
        merge(arr, leftHalf, righthalf);
    }

    // Merge-Method:
    private static void merge(int[] arr, int[] leftHalf, int[] righthalf) {
        // Bestimmen der längen der Arrays:
        int leftSize = leftHalf.length;
        int rightSize = righthalf.length;
        // Indizies für die While-Schleife:
        int i = 0, j = 0, k = 0;
        // While-Schleife zum Mergen der 2 Arrays, in das ursprüngliche Array:
        while(i < leftSize && j < rightSize) {
            if(leftHalf[i] <= righthalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = righthalf[j];
                j++;
            }
            k++;
        }
        // Hinzufügen der Übrig gebliebenen Elemente in das ursprüngliche Array:
        while(i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j < rightSize) {
            arr[k] = righthalf[j];
            j++;
            k++;
        }
    }


}
