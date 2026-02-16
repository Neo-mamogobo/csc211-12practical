import java.util.Random;
public class Question1B {
    static int mcsOn3(int[] X){
        int n = X.length;
        int maxsofar = 0;

        for(int low = 0; low < n; low++){
            for(int high = low; high < n; high++){
                int sum = 0;

                for(int r = 0; r <= high; r++){
                    sum += X[r];

                    if(sum > maxsofar){
                        sum = maxsofar;
                    }
                }
            }
        }
        return maxsofar;
    }

    static int mcsOn2A(int[] X){
        int n = X.length;
        int maxsofar = 0;

        for(int low = 0; low < n; low++){
            int sum = 0;
            for(int high = low; high <= low; high++){
                sum += X[high];

                if(sum > maxsofar){
                    sum = maxsofar;
                }
            }
        }
        return maxsofar;
    }
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
                    int sum;

                    if(low==0) sum = sumto[high];
                    else sum = sumto[high] - sumto[low - 1];

                    if (sum > maxsofar) {
                        maxsofar = sum;
                    }
                }
            }

        }
        return maxsofar;
    }
    static int mcsOn(int[] X){
        int n = X.length;
        int maxsofar = 0;
        int maxtohere = 0;

        for(int i = 1; i < n; i++){
            maxtohere = Math.max(maxtohere + X[i], 0);
            maxsofar = Math.max(maxsofar, maxtohere);
        }
        return maxsofar;
    }
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
        System.out.println( countM + " " + countM + " " + countP + " " + countP);
        System.out.println( mcsOn3(X) + " "  + mcsOn2A(X) + " "  + mcsOn2B(X) + " "  + mcsOn(X));
        System.out.println( mcsOn3(X) + " "  + mcsOn2A(X) + " "  + mcsOn2B(X) + " "  + mcsOn(X));
        System.out.println( mcsOn3(X) + " "  + mcsOn2A(X) + " "  + mcsOn2B(X) + " "  + mcsOn(X));
        System.out.println( mcsOn3(X) + " "  + mcsOn2A(X) + " "  + mcsOn2B(X) + " "  + mcsOn(X));
    }
}
