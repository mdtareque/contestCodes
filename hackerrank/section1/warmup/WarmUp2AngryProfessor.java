/**
 *
 */
package hackerrank.section1.warmup;

import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/angry-professor
 */
// DONE
public class WarmUp2AngryProfessor {
    
    static void p(final Object o) {
        System.out.println(o);
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int t, N, K, temp, numberOfStudentBeforeClassStart = 0;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            N = in.nextInt();
            K = in.nextInt();
            numberOfStudentBeforeClassStart = 0;
            for (int j = 0; j < N; j++) {
                temp = in.nextInt();
                if (temp <= 0) {
                    numberOfStudentBeforeClassStart++;
                }
            }
            
            if (numberOfStudentBeforeClassStart < K) {
                p("YES");
            } else {
                p("NO");
            }
        }
    }
    
}
