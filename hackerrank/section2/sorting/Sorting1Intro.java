/**
 *
 */
package hackerrank.section2.sorting;

import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/tutorial-intro
 */
// DONE
public class Sorting1Intro {
    
    private static Scanner in;

    public static void main(final String[] args) {
        in = new Scanner(System.in);
        int V, N, temp;
        V = in.nextInt();
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            temp = in.nextInt();
            if (temp == V) {
                System.out.println(i);
            }
        }
    }
}
