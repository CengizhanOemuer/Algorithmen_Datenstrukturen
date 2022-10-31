package Java.Algorithmen.Search;

public class BinarySearch {
    // Iterative Binary-Search Method:
    public static void iterative_binarySearch(int[] array, int value, int low, int high) {
        // Helpful variables:
        int index = -1;
        boolean found = false;
        // While-Loop:
        while(low <= high) {
            int mid = low + ((high - low) / 2); 
            if(array[mid] < value) {    // Index of mid lower than value
                low = mid + 1;
            }
            else if(array[mid] > value) {   // Index of mid higher than value
                high = mid - 1;
            }
            else if(array[mid] == value) {  // Index of mid equal to value
                index = mid;
                found = true;
                break;
            }
        }
        System.out.println("Binary-Search Successful? "+ found + " at index: " + index);
    }

    public static int recursive_binarySearch(int[] array, int value, int low, int high) {
        // Calculating the middle index:
        int mid = low + ((high - low) / 2);
        // Break-condition 1:
        if(high < low) {
            return -1;
        }
        // Break-condition 2:
        if(array[mid] == value) {
            return mid;
        }
        else if(array[mid] < value) {
            return recursive_binarySearch(array, value, mid+1, high);
        }
        else {
            return recursive_binarySearch(array, value, low, mid-1);
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        iterative_binarySearch(sortedArray, 5, 1, 20);
        iterative_binarySearch(sortedArray, 13, 0, 20);
        System.out.println("\n");
        System.out.println("Int value: 18 found at index:" + recursive_binarySearch(sortedArray, 18, 0, 20));
    }


}

