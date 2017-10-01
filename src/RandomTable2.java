import java.util.Scanner;
import java.util.Random;

public class RandomTable2 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomTable = new int[10];
        int i = 0;
        int j = 9;

        for (i = 0; i < randomTable.length * 2; i++) {
            if (i > 9) {
                System.out.println(randomTable[j]);
                j--;
            } else {
                randomTable[i] = random.nextInt();
                System.out.println(randomTable[i]);
            }
        }
    }
}
