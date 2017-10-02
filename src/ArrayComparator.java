import java.util.Arrays;

public class ArrayComparator {

    boolean compare(int tablica1[][], int tablica2[][]) {
        boolean result = true;


        for (int i = 0; i < tablica1.length&&result; i++) {
            for (int j = 0; j < tablica1[i].length && result; j++) {
                if (tablica1[i][j] != tablica2[i][j]) {
                    result = false;
                }

            }
        }
        return result;
    }
}
