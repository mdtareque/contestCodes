package hackerrank.section1.warmup;

import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/maximizing-xor
 */
// DONE
public class WarmUp5MaxOr {

    static void p(final Object o) {
        System.out.println(o);
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int T, sum = 0, a, b;
        a = in.nextInt();
        b = in.nextInt();
        int max = 0;
        for(int i = a; i < b; i++) {
            for(int j = a; j <= b; j++) {
                if((i ^ j) > max) {
                    max = i ^ j;
                }
            }
        }
        p(max);
        
    }
}
