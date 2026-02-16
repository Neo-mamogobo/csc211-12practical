public class MCSON2 {

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
}
