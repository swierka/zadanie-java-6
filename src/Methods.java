import java.util.Arrays;
import java.util.Random;

public class Methods {

    int randomize(int[][] wejscie) {
        int n = 0;
        int m = 0;
        int newTable[][] = new int[n][m];
        Random random = new Random();

        int i = 0;
        newTable[n][m] = random.nextInt();
        for (n = 0; ; n++) {
            for (m = 0; ; m++) {
                newTable[n][m] = random.nextInt();

                return newTable[n][m];
            }
        }
    }

    int findMax(int[][] wejscie) {
        int max = wejscie[0][0];

        for (int i = 1; i < wejscie.length; i++) {
            for (int j = 1; j < wejscie[i].length; j++) {
                if (wejscie[i][j] > max) {
                    max = wejscie[i][j];
                }
            }
        }
        return max;
    }

    int findMin(int[][] wejscie) {
        int min = wejscie[0][0];

        for (int i = 1; i < wejscie.length; i++) {
            for (int j = 1; j < wejscie[i].length; j++) {
                if (wejscie[i][j] < min) {
                    min = wejscie[i][j];
                }
            }
        }
        return min;
    }

    void print(int[][] wejscie) {
        for (int i = 0; i < wejscie.length; i++) {
            for (int j = 0; j < wejscie[i].length; j++)
                System.out.println(wejscie[i][j]);
        }
    }
}

