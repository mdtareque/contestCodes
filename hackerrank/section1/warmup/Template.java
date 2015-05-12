package hackerrank.section1.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Template {
    
    static void p(final Object o) {
        System.out.println(o);
    }

    public static void main(final String[] args) {
    	String input = "";
        final Scanner in = new Scanner(new ByteArrayInputStream(input.getBytes()));
//        final Scanner in = new Scanner(System.in);
        int T, sum = 0, a, b;
        T = in.nextInt();
        for (int i = 0; i < T; i++) {
            a = in.nextInt();
            b = in.nextInt();
            p(sum);
        }
    }
}
