package codejam15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class template {
	public static void main(String[] args) throws IOException {
		System.out.println("here");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s= br.readLine()) != null) {
			System.out.println(s);
		}
	}
}
