package hackerrank.section1.warmup;

import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/summing-the-n-series
 */
// DONE
public class WarmUp3SumNSeries {
    
    final static long MOD = 1000_000_000 + 7;
    
    static void p(final Object o) {
        System.out.println(o);
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int T;
        long N, firstTerm, Sn;
        T = in.nextInt();
        for (int i = 0; i < T; i++) {
            N = in.nextLong();
            firstTerm = ((N * (N + 1)) % MOD);
            Sn = firstTerm - N;
            p(Sn % MOD);
        }
    }
}
