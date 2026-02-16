public class MCSN2 {

    static int mcsOn2B(int[] X) {
        int n = X.length;
        int[] sumto = new int[n];
        sumto[0] = X[0];

        int maxsofar = 0;
        for (int i = 1; i < n; i++) {
            sumto[i] = sumto[i - 1] + X[i];
            maxsofar = 0;

            for (int low = 0; low < n; low++) {
                for (int high = low; high < n; high++) {
                    int sum = sumto[high] - sumto[low - 1];

                    if (sum > maxsofar) {
                        maxsofar = sum;
                    }
                }
            }

        }
        return maxsofar;
    }
}
