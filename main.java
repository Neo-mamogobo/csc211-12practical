import java.util.Random;

public class main {
    public static void main(String[] args) {
        int n = 20;
        Random rand = new Random();
        int[] X = new int[n];
        for (int k = 0; k < n; k++) {
            int r = rand.nextInt(n) + 1;
            int p = (int) Math.pow(-1, rand.nextInt(3) + 2);
            X[k] = r * p;
        }
            int countP = 0;
            int countM = 0;

            for (int x : X) {
                if (x < 0) {
                    countM += 1;
                } else {
                    countP += 1;
                }
            }
        System.out.println();
        System.out.println(" countM = " + countM + " countP = " + countP);
    }
}
