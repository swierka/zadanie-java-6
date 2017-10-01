import java.util.Arrays;

public class ArrayComparator {

    boolean compare(int tablica1[][], int tablica2[][]) {
        int i = 0;
        int j = 0;
        boolean result = false;
        boolean result2 = false;
        boolean result3 = false;
        for (i = 0; i < tablica1.length; i++) {
            for (j = 0; j < tablica1[i].length; j++) {
                result = Arrays.equals(tablica1[i], tablica2[i]);
                result2 = Arrays.equals(tablica1[j], tablica2[j]);
            }
        }

        if (result == true && result2 == true) {
            result3 = true;
        } else {
            result3 = false;
        }
        return result3;
    }
}
