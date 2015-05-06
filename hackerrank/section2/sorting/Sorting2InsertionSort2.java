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

    public static int[] insertIntoSorted(int[] ar, int indexToSort) {
        int s, v, i;
        boolean inplace = false;
        s = indexToSort + 1;
        if(s == 2) {
            if(ar[0] > ar[1]) {
                ar[0] = ar[0] + ar[1];
                ar[1] = ar[0] - ar[1];
                ar[0] = ar[0] - ar[1];
                return ar;
            } else {
                return ar;
            }
        }
        v = ar[s - 1];
        if(s > 0) {
            ar[s - 1] = ar[s - 2];
        }
        i = s - 2;
        do {
            if(i == 0) {
                ar[i--] = v;
            } else if(((i > 0) && (ar[i - 1] < v)) && (ar[i + 1] > v)) {
                ar[i] = v;
                inplace = true;
            } else if((i > 0) && (ar[i - 1] > v)) {
                ar[i] = ar[i - 1];
                i--;
            } else if(ar[i + 1] < v) {
                ar[i + 1] = v;
                inplace = true;
            }
        } while(!inplace && (i >= 0));
        return ar;
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
            
        }
//        int[] ar2 = { 2, 1, 4, 5, 6, 7, 8, 9, 10, 1 };
//        int[] ar2 = { 2, 1, 4, 7, 3 };
//        int[] ar3 = { 2, 1 };
//        ar2 = insertIntoSorted(ar3, 1);
        for(int i = 1; i < ar.length; i++) {
            ar = insertIntoSorted(ar, i);
            printArray(ar);
        }
    }

    private static void printArray(int[] ar) {
        for(int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

}
