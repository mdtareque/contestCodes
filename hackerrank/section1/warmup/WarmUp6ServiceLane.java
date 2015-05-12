package hackerrank.section1.warmup;

import java.util.Scanner;

/**
 * @author mtk
 *
 */
public class WarmUp6ServiceLane {

    static void p(final Object o) {
        System.out.println(o);
    }
    
    static int[] width;
    
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int T, sum = 0, a, b, N;
        N = in.nextInt();
        T = in.nextInt();
        System.err.println(N + " " + T);
        width = new int[N];
        for(int i = 0; i < N; i++) {
            width[i] = in.nextInt();
            System.err.println(width[i]);
        }

        System.out.println("ans");
        for(int i = 0; i < T; i++) {
            a = in.nextInt();
            b = in.nextInt();
            System.err.print(a + ", " + b + " ");
            p(minimumInRange(a, b));
        }
    }

    private static int minimumInRange(int a, int b) {
        int min = 9999;
        for(int i = a; i <= b; i++) {
            if(width[i] < min) {
                min = width[i];
            }
        }
        return min;
    }
}
