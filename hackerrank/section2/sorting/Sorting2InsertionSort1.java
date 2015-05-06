/**
 *
 */
package hackerrank.section2.sorting;

import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/insertionsort1
 */
// BUG
public class Sorting2InsertionSort1 {

    public static void insertIntoSorted(int[] ar) {
        int s, v, i;
        boolean inplace = false;
        s = ar.length;
        v = ar[s - 1];
        i = s - 2;
        do {
            if(ar[i] < v) {
                inplace = true;
            } else {
                ar[i] = ar[i - 1];
                ar[i - 1] = v;
            }
            printArray(ar);
        } while(!inplace);
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for(int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

}
