import java.util.Random;
import java.util.Arrays;

public class MultiArray {
    int[][] tablica;
    Random random = new Random();

    public MultiArray(int n, int m) {
        this.tablica = new int[n][m];

        tablica[n][m] = random.nextInt();
        for (n = 0; ; n++) {
            for (m = 0; ; m++) {
                tablica[n][m] = random.nextInt();
            }
        }
    }

    int randomize(int[][] tablica) {
        this.tablica = tablica;
        Random random = new Random();

        tablica[n][m] = random.nextInt();
        for (n = 0; ; n++) {
            for (m = 0; ; m++) {
                tablica[n][m] = random.nextInt();

                return tablica[n][m];
            }
        }
    }

    int findMax(int[][] tablica) {
        this.tablica = tablica;
        int max = tablica[0][0];

        for (int n = 1; n < tablica.length; n++) {
            for (int m = 1; m < tablica[n].length; m++) {
                if (tablica[n][m] > max) {
                    max = tablica[n][m];
                }
            }
        }
        return max;
    }

    int findMin(int[][] tablica) {
        this.tablica = tablica;
        int min = tablica[0][0];

        for (int n = 1; n < tablica.length; n++) {
            for (int m = 1; n < tablica[n].length; m++) {
                if (tablica[n][m] < min) {
                    min = tablica[n][m];
                }
            }
        }
        return min;
    }

    void print(int[][] tablica) {
        this.tablica = tablica;
        for (int n = 0; n < tablica.length; n++) {
            for (int m = 0; m < tablica[n].length; m++)
                System.out.println(tablica[n][m]);
        }
    }
}