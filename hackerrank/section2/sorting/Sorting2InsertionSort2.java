/**
 *
 */
package hackerrank.section2.sorting;

import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/insertionsort2
 */
// DONE
public class Sorting2InsertionSort2 {

    public static void insertIntoSortedArray(int[] ar, int i) {
        int n = ar[i];
        i--;
        while((i >= 0) && (ar[i] > n)) {
            ar[i + 1] = ar[i]; // shift right
            i--;
        }
        ar[i + 1] = n;
        printArray(ar);
    }

    static void insertionSort(int[] ar) {
        for(int i = 1; i < ar.length; i++) {
            insertIntoSortedArray(ar, i);
        }

    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
            
        }
        insertionSort(ar);
    }

    private static void printArray(int[] ar) {
        for(int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

}
