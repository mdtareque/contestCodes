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

}

class Template {

	// a must be larger number
	public static long gcd(long a, long b) {
		return (b == 0 ? a : gcd(b, a % b));
	}

	public static void p(final Object o) {
		System.out.println(o);
	}

	public static void main(final String[] args) {
		final Scanner in = new Scanner(System.in);
		int t, a, b;
		t = in.nextInt();
		// read test case and two number in each
		for (int i = 0; i < t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			p(a);
		}
	}

	private static void print1darray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.printf(" %02d ", arr[i]);
		System.out.println();
	}

	private static void print2darray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.printf(" %02d ", arr[i][j]);
			System.out.println();
		}
	}

	private static void print3darray(int[][][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++)
					System.out.printf(" %02d ", arr[i][j][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
