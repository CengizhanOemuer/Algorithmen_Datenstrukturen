package Java.Algorithmen.Sort;

public class IstSortiert {
    // Methode: 
    public static boolean istSortiert(int[] array) {
        for(int i = 0; i <= array.length -2; i++) {
            if(array[i] > array[i+1]) { // Falls das Element an i größer als an i+1 ist, dann ist das Array nicht sortiert!
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {9,1,2,4,3,5,6,8,7,10};

        System.out.println("Array a sortiert? " + istSortiert(a));
        System.out.println("Array b sortiert? " + istSortiert(b));


    }
}
