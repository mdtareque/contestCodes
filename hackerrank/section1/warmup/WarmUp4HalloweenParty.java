package hackerrank.section1.warmup;

import java.util.Scanner;

/**
 * @author mtk url: https://www.hackerrank.com/challenges/halloween-party
 */
// DONE
public class WarmUp4HalloweenParty {
    
    static void p(final Object o) {
        System.out.println(o);
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int T, sum = 0;
        long K;
        T = in.nextInt();
        for (int i = 0; i < T; i++) {
            K = in.nextLong();
            p(((K % 2) == 0 ? (K / 2) * (K / 2) : (K / 2) * ((K / 2) + 1)));
        }
    }
}
