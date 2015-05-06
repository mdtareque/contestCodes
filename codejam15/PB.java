package codejam15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


enum STATIC_DATA {
	NINE(9);
	int num;
	private STATIC_DATA(int i) {
		this.num = i;
	}
	static int findMinsForNum(int x) {
		return 0;
	}
}
public class PB {
	int D;
	int maxP;
	int countOfmaxP;

	public PB() {
		D = 0;
		maxP = -1;
		countOfmaxP = 0;
	}

	int findMinimumMinutesNeededToFinishXPanCakes(int x) {
		if (x <= STATIC_DATA.NINE.num)
			return STATIC_DATA.findMinsForNum(x);
		else
			return 1 + findMinimumMinutesNeededToFinishXPanCakes(x / 2); // no
																			// worry
																			// for
																			// even
																			// numbers
																			// and
																			// relying
																			// on
																			// integer
																			// division
																			// for
																			// odd
																			// number
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
//		 PB prob = new PB();
//		 for(int i=0 ; i< 11; i++)
//		 System.out.println(i+ ": "
//		 +prob.findMinimumMinutesNeededToFinishXPanCakes(i));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens;
		int caseNo = 1, T = Integer.parseInt(br.readLine()), pancakes = 0;
//		System.out.println("T is " + T);

		while (caseNo <= T) {
			PB probB = new PB();
			probB.D = Integer.parseInt(br.readLine());
			String s = br.readLine();
//			System.out.println(s);
			tokens = s.split(" ");
			for (int i = 0; i < tokens.length; i++) {
				pancakes = Integer.parseInt(tokens[i]);
				if (pancakes > probB.maxP) {
					probB.maxP = pancakes;
					probB.countOfmaxP = 1;
				} else if (pancakes == probB.maxP) {
					probB.countOfmaxP++;
				}
			}
			int minutesForSingleMaxPancakesX = probB.findMinimumMinutesNeededToFinishXPanCakes(probB.maxP);
			int ans = 0;
			if (probB.countOfmaxP > (probB.maxP - minutesForSingleMaxPancakesX + 1)) {
//				System.out.println("simply exceeding : "+probB.countOfmaxP);
				ans = probB.countOfmaxP;
			}
			else {
//				System.out.println("calculate : " +(minutesForSingleMaxPancakesX + (probB.countOfmaxP - 1)));
				ans = minutesForSingleMaxPancakesX + (probB.countOfmaxP - 1);
			}
			System.out.println("Case #" + caseNo++ +": " + ans);
		}
	}
}
