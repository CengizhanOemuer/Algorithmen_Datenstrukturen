package Java.Algorithmen.Search;

class ggt {
    public static void main(String[] args) {
        System.out.println("Der ggT von 10 und 5 ist " + ggT(10, 5));
        System.out.println("Der ggT von 5 und 10 ist " + ggT(5, 10));

    }

    // GGT von zwei Zahlen x und y:
    public static int ggT(int x, int y) {
        while(x != y) {
            if(x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
            if(x == y) {
                return x;
            }
        }



        // Falls irgendetwas schief läuft:
        return -1;
    }
}