package Java.Algorithmen.Sort;

class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,7,9,8,4,6,0};
        int[] sortArray = bubbleSort(array);
        for(int e : sortArray) {
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

   

}