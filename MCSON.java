public class MCSON {

    static int mcsOn(int[] X){
        int n = X.length;
        int maxsofar = 0;
        int maxtohere = 0;

        for(int i = 0; i < n; i++){
            maxtohere = Math.max(maxtohere + X[i], 0);
            maxsofar = Math.max(maxsofar, maxtohere);
        }
        return maxsofar;
    }
}
