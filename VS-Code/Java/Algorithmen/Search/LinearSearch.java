package Java.Algorithmen.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,8,7,4,6,5};
        System.out.println(linearSearch(arr, 10));
    }

    // Iterative:
    public static boolean linearSearch(int[] array, int num) {
        for(int i=0; i < array.length-1; i++) {
            if(array[i] == num) {
                return true;
            }
        }
        return false;
    }
}
