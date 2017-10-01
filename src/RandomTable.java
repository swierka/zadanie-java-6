import java.util.Scanner;
import java.util.Random;
//wersja dzialajaca ale z dwiema petlami
public class RandomTable {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomTable = new int[10];
        int i = 0;

        for (i = 0; i < randomTable.length; i++) {
            randomTable[i] = random.nextInt();
            System.out.println(randomTable[i]);
        }

        for (i = 0; i < randomTable.length; i++) {
            int pomocnicza = randomTable.length - i - 1;
            System.out.println(randomTable[pomocnicza]);
        }
    }
}
