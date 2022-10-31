package Java.Algorithmen.Sort;

public class InsertionSort {
    public static void main(String[] args) {
        // 
        int[] unsorted = {4, 1, 8, -3, 5, 7};
        int[] sorted = insertionSort(unsorted);

        for(int i : sorted) {
            System.out.println(i);
        }
    }

    // Iterative:
    private static int[] insertionSort(int[] unsorted) {
        int help;
        for(int i=0; i < unsorted.length; i++) {
            // Switching the variables:
            help = unsorted[i];
            int j = i;
            while(j > 0 && unsorted[j - 1] > help) {
                unsorted[j] = unsorted[j - 1];
                j--;
            }
            unsorted[j] = help;

        }
        return unsorted;
    }    
}