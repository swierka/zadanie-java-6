import java.util.Random;

public class MultiArray {
    int N;
    int M;
    int[][] tablica = new int[N][M];
    Random random = new Random();

    public MultiArray(int n, int m) {
        N = n;
        M = m;
        this.tablica = tablica;
        tablica[N][M] = random.nextInt();
        for (n = 0; ; n++) {
            for (m = 0; ; m++) {
                tablica[n][m] = random.nextInt();
            }
        }
    }
}