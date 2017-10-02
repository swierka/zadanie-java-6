import java.util.Arrays;

public class ArrayComparator {

    boolean compare(int tablica1[][], int tablica2[][]) {
        int i = 0;
        int j = 0;
        boolean result = false;

        outerLoop:
        for (i = 0; i < tablica1.length; i++) {
            for (j = 0; j < tablica1[i].length; j++) {
                if (tablica1[i][j] == tablica2[i][j]) {
                    break;
                } else {
                    break outerLoop;
                }
            }

            if (i == (tablica1.length-1) && j == (tablica2.length-1)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
