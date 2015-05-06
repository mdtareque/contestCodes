/**
 *
 */
package hackerrank.section2.sorting;

import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/insertionsort1
 */
// DONE
public class Sorting2InsertionSort1 {

    public static void insertIntoSorted(int[] ar) {
        int s, v, i;
        boolean inplace = false;
        s = ar.length;
        v = ar[s - 1];
        if(s > 1) {
            ar[s - 1] = ar[s - 2];
        }
        i = s - 2;
        printArray(ar);
        // v = 1
        // 2 4 5 8 4 4
        // ^
        do {
            if(i == 0) {
                ar[i] = v;
                i--;
            } else if(((i > 0) && (ar[i - 1] < v)) && (ar[i + 1] > v)) {
                ar[i] = v;
                inplace = true;
            } else if((i > 0) && (ar[i - 1] > v)) {
                ar[i] = ar[i - 1];
                i--;
            }
            printArray(ar);
        } while(!inplace && (i >= 0));
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
//      int[] ar2 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 };
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for(int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

}
