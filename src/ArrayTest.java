public class ArrayTest {

    public static void main(String[] args) {
        int[][] tablica1 = new int[2][2];
        int[][] tablica2 = new int[2][2];

        tablica1[0][0] = 4;
        tablica1[0][1] = 4;
        tablica1[1][0] = 4;
        tablica1[1][1] = 4;


        tablica2[0][0] = 4;
        tablica2[0][1] = 4;
        tablica2[1][0] = 4;
        tablica2[1][1] = 4;


        ArrayComparator arrayComparator = new ArrayComparator();
        boolean wynik = arrayComparator.compare(tablica1, tablica2);
        System.out.println(wynik);
    }
}

