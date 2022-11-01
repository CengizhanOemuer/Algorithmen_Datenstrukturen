package Java.Algorithmen.Sort;

import Java.Algorithmen.Help.HelpMethods;

class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,7,9,8,4,6,0};
        
        int[] sortArray = bubbleSort(array);
        HelpMethods.printArray(sortArray);
        
        System.out.println("---------------------------");

        int[] sortedIterativ = bubbleSortI(array);
        HelpMethods.printArray(sortedIterativ);
    }

    // Recursive:
    public static int[] bubbleSort(int[] array) {
        for(int i=0; i < array.length - 1; i++) {
            // Rekursionsanker:
            if(array[i] < array[i+1]) {
                continue;
            }
            // Vertauschen der Indizies:
            HelpMethods.swap(array, i, i+1);
            // Rekursiveraufruf des Algorithmuses mit neuenm Array:
            bubbleSort(array);
        }
        return array;
    }

    // Itterativ: // Ist bisschen komisch aber funktioniert, würde es aber in der Form nicht verwenden!
    public static int[] bubbleSortI(int[] arr) {
        int i=0;
        while(arr[i] < arr[i+1]) {
            if(i == arr.length-2) {
                break;
            }
            if(arr[i] < arr[i+1]) {
                HelpMethods.swap(arr, i, i+1);
            }
            HelpMethods.swap(arr, i, i+1);
            i++;
        }
        return arr;
    }

   

}