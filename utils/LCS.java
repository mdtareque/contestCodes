package utils;

/**
 * @author mtk
 *
 */
public class LCS {
    
    static String lcs(String x, String y) {
        int M = x.length();
        int N = y.length();

        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
        int[][] opt = new int[M + 1][N + 1];

        // compute length of LCS and all subproblems via dynamic programming
        for(int i = M - 1; i >= 0; i--) {
            for(int j = N - 1; j >= 0; j--) {
                if(x.charAt(i) == y.charAt(j)) {
                    opt[i][j] = opt[i + 1][j + 1] + 1;
                } else {
                    opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);
                }
            }
        }

        // recover LCS itself and print it to standard output
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while((i < M) && (j < N)) {
            if(x.charAt(i) == y.charAt(j)) {
                sb.append(x.charAt(i));
                i++;
                j++;
            } else if(opt[i + 1][j] >= opt[i][j + 1]) {
                i++;
            } else {
                j++;
            }
        }
        return sb.toString();
    }
    
    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    static void lcs(String X, String Y, int m, int n) {
        int[][] L = new int[m + 1][n + 1];
        
        // Following steps build L[m+1][n+1] in bottom up fashion. Note
        // that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if((i == 0) || (j == 0)) {
                    L[i][j] = 0;
                } else if(X.charAt(i - 1) == Y.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        
        // Following code is used to print LCS
        int index = L[m][n];
        
        // Create a character array to store the lcs string
        char[] lcs = new char[index + 1];
        lcs[index] = '\0'; // Set the terminating character
        
        // Start from the right-most-bottom-most corner and one by one store characters in lcs[]
        int i = m, j = n;
        while((i > 0) && (j > 0)) {
            // If current character in X[] and Y are same, then current character is part of LCS
            if(X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcs[index - 1] = X.charAt(i - 1);
                i--;
                j--;
                index--;
            }
            
            // If not same, then find the larger of two and go in the direction of larger value
            else if(L[i - 1][j] > L[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        
        System.out.println("LCS of " + X + " and " + Y + ", is " + String.valueOf(lcs));
    }
    
    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        // solution 1
        lcs(X, Y, m, n);
        // solution 2
        System.out.println(lcs(X, Y));
    }
}
