import java.util.Random;
import java.util.Arrays;

public class MultiArray {
    private int[][] tablica;
    private Random random = new Random();

    public MultiArray(int n, int m) {
        this.tablica = new int[n][m];

        randomize(); //
    }

    void randomize() {
        for (int n = 0; n < tablica.length; n++) {
            for (int m = 0; m < tablica[n].length; m++) {
                tablica[n][m] = random.nextInt(100);
            }
        }
    }

    int findMax() {
        int max = tablica[0][0]; //najlepiej przypisac 1. element z tablicy

        for (int n = 0; n < tablica.length; n++) {
            for (int m = 0; m < tablica[n].length; m++) {
                if (tablica[n][m] > max) {
                    max = tablica[n][m];
                }
            }
        }
        return max;
    }

    int findMin() {
        int min = tablica[0][0];

        for (int n = 0; n < tablica.length; n++) {
            for (int m = 0; n < tablica[n].length; m++) {
                if (tablica[n][m] < min) {
                    min = tablica[n][m];
                }
            }
        }
        return min;
    }

    void print() {
        for (int n = 0; n < tablica.length; n++) {
            for (int m = 0; m < tablica[n].length; m++)
                System.out.print(tablica[n][m] + " ");
            System.out.println();
        }
    }
}