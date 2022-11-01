package Java.Algorithmen.Sort;

class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,7,9,8,4,6,0};
        int[] sortArray = bubbleSort(array);
        
        for(int e : sortArray) {
            System.out.println("" + e);
        }
        
        System.out.println("---------------------------");

        int[] sortedIterativ = bubbleSortI(array);
        for(int e : sortedIterativ) {
            System.out.println("" + e);
        }
    }

    // Recursive:
    public static int[] bubbleSort(int[] array) {
        int help;   // Wird benötigt beim Vertauschen der Indizies!
        for(int i=0; i < array.length - 1; i++) {
            // Rekursionsanker:
            if(array[i] < array[i+1]) {
                continue;
            }
            // Vertauschen der Indizies:
            help = array[i];
            array[i] = array[i+1];
            array[i+1] = help;
            // Rekursiveraufruf des Algorithmuses mit neuenm Array:
            bubbleSort(array);
        }
        return array;
    }

    // Itterativ: // Ist bisschen komisch aber funktioniert, würde es aber in der Form nicht verwenden!
    public static int[] bubbleSortI(int[] arr) {
        int help;
        int i=0;
        while(arr[i] < arr[i+1]) {
            if(i == arr.length-2) {
                break;
            }
            if(arr[i] < arr[i+1]) {
                help = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = help;
            }
            help = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = help;
            i++;
        }
        return arr;
    }

   

}