package Java.Algorithmen.Help;

public class HelpMethods {
    
    // Methoden zur Hilfe für die Algorithmen:

    // Methode um zu kontrolieren ob ein Array sortiert ist:
    public static boolean istSortiert(int[] array) {
        for(int i = 0; i <= array.length -2; i++) {
            if(array[i] > array[i+1]) { // Falls das Element an i größer als an i+1 ist, dann ist das Array nicht sortiert!
                return false;
            }
        }
        return true;
    }

    // Swap-Methode: Zum Vertauschen zweier Indizes in einem Array!
    public static void swap(int[] arr, int i, int j) {
        int help = arr[i];
        arr[i] = arr[j];
        arr[j] = help;
    }

    // Array ausgeben: Gibt das Array aus!
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "] = " + arr[i]);
        }
    }
}
