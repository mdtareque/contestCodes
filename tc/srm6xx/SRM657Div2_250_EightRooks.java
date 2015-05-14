package tc.srm6xx;

/**
 * @author mtk
 *
 */
public class SRM657Div2_250_EightRooks {

	public static void main(String[] args) {
		String[] in = new String[] {"........",
			 "....R...",
			 "........",
			 ".R......",
			 "........",
			 "........",
			 "..R.....",
			 "........"};
		System.out.println(new EightRooks().isCorrect(in));
	}
}

class EightRooks {
	public String isCorrect(String[] board) {
		final int n = 8;
		for(int i=0; i<n; i++) {
			int numOfRooksInaRow = 0;
			int numOfRooksInaCol = 0;
			for(int j=0; j<n; j++) {
				if(board[i].charAt(j) == 'R') numOfRooksInaRow++;
				if(board[j].charAt(i) == 'R') numOfRooksInaCol++;
			}
			if(numOfRooksInaCol != 1 && numOfRooksInaRow!=1)
				return "Incorrect";
		}
		return "Correct";
	}
}
