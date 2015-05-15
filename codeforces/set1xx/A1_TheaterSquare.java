package codeforces.set1xx;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author mtk http://mtktechiecode.blogspot.in/
 * May 15, 2015 11:57:57 PM
 */
public class A1_TheaterSquare {

	private static final Pattern splitOnSpace = Pattern.compile(" ");	
	private static int[] parseIntArray(String str) {
//		return Stream.of(str).mapToInt(Integer::parseInt).toArray();
		return splitOnSpace.splitAsStream(str).mapToInt(Integer::parseInt).toArray();
	}

	public static void main(String[] args) {
		
		String input = "6 6 4";
//		Scanner in = new Scanner(new ByteArrayInputStream(input.getBytes()));
		input = new Scanner(System.in).nextLine();
		solve(parseIntArray(input));
	}

	private static void solve(int[] d) {
		long m,n,a;
		long sqThatHorizontally = 1, sqThatVertically = 1;
		m = d[0];
		n = d[1];
		a = d[2];
		sqThatHorizontally = (long) Math.ceil((double)n/a);
		sqThatVertically = (long) Math.ceil((double)m/a);
		System.out.println(sqThatHorizontally*sqThatVertically);
	}


}