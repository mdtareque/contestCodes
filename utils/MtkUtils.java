/**
 *
 */
package utils;

import java.util.Scanner;

/**
 * @author mtk
 *
 */
public class MtkUtils {

    // a must be larger number
    public static long gcd(long a, long b) {
        return(b == 0 ? a : gcd(b, a % b));
    }

    public static void p(final Object o) {
        System.out.println(o);
    }
}

class Template {
    
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int t, a, b;
        t = in.nextInt();
        // read test case and two number in each
        for(int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            MtkUtils.p(a);
        }
    }
    
}
