package hackerrank.section4.search;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/connected-cell-in-a-grid
 */
// DONE MEDIUM RECURSION, checks setter solution
public class Search1ConnectedGrid {
    
    static void p(final Object o) {
        System.out.println(o);
    }
    
    static int T, m, n, a, numOf1s;
    static int[][] grid ;
    public static void main(final String[] args) {
    	String input = "4\n" + "4\n" + "1 1 0 0\n" + "0 1 1 0\n" + "0 0 1 0\n" + "1 0 0 0\n";
    	input = "8\r\n" + 
    			"9\r\n" + 
    			"0 1 0 0 0 0 1 1 0\r\n" + 
    			"1 1 0 0 1 0 0 0 1\r\n" + 
    			"0 0 0 0 1 0 1 0 0\r\n" + 
    			"0 1 1 1 0 1 0 1 1\r\n" + 
    			"0 1 1 1 0 0 1 1 0\r\n" + 
    			"0 1 0 1 1 0 1 1 0\r\n" + 
    			"0 1 0 0 1 1 0 1 1\r\n" + 
    			"1 0 1 1 1 1 0 0 0\r\n";
        final Scanner in = new Scanner(new ByteArrayInputStream(input.getBytes()));
//        final Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        grid = new int[m][n];
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		grid[i][j] = in.nextInt();
        		if(grid[i][j] == 1) numOf1s++;
//        		System.out.print(grid[i][j] + " ");
        	}
//        	System.out.println();
        }
        p(findMaxConnectedComponent(grid, numOf1s));
    }

	/**
	 * @param grid
	 * @return
	 */
	private static Object findMaxConnectedComponent(int[][] grid, int pendingCells) {
		int maxSoFar = -1, countThisScan=0;
		
		while(pendingCells > 0 && pendingCells > maxSoFar) {
			int i=0,j=0;
			outer:
			for(i = 0; i < grid.length; i++) {
	        	for(j = 0; j < grid[i].length; j++) {
	        		if(grid[i][j] == 1) {
	        			grid[i][j] = 9; // marking scheme
	        			break outer;
	        		}
	        	}
			}
        	// grid implied
        	countThisScan = 1 + markAll(i, j);
        	if(countThisScan > maxSoFar) maxSoFar = countThisScan;
        	zeroingCellsThisScan();
        	pendingCells -= countThisScan;
//        	printGrid();
		}
		
		return maxSoFar;
	}

	/**
	 * 
	 */
	private static void printGrid() {
		System.out.println();
		System.out.println();
		for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[i].length; j++) {
        		System.out.print(grid[i][j]+ " ");
        	}
        	System.out.println();
		}
	}

	/**
	 * 
	 */
	private static void zeroingCellsThisScan() {
		for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[i].length; j++) {
        		if(grid[i][j] == 9) grid[i][j] = 0;
        	}
        }
	}

	/**
	 * @param grid
	 * @param i
	 * @param j
	 */
	private static int markAll(int i, int j) {
		if(i<0 && j<0) return 0;
		if(i>=m ||j>=n) return 0;
//		printGrid();
		int totalCells1=0;
		if(j>0) // left
			if(grid[i][j-1] == 1)// || grid[i][j-1] == 9) 
			{ grid[i][j-1] = 9; totalCells1 += 1 + markAll(i, j-1);}
		if(j<n-1 && j>=0) // right
			if(grid[i][j+1] == 1)// || grid[i][j+1] == 9) 
			{ grid[i][j+1] = 9; totalCells1 += 1 + markAll(i, j+1);}
		if(i>0) // up
			if(grid[i-1][j] == 1)// || grid[i-1][j] == 1)
			{ grid[i-1][j] = 9; totalCells1 += 1 + markAll(i-1, j);}
		if(i<m-1) // down
			if(grid[i+1][j] == 1)// || grid[i+1][j] == 1) 
			{ grid[i+1][j] = 9; totalCells1 += 1 + markAll(i+1, j);}
		
		if(j>0 && i>0)
			if(grid[i-1][j-1] == 1)
			{ grid[i-1][j-1] = 9; totalCells1 += 1 + markAll(i-1, j-1);}
		if(j<n-1 && i>0)
			if(grid[i-1][j+1] == 1) 
			{ grid[i-1][j+1] = 9; totalCells1 += 1 + markAll(i-1, j+1);}
		if(i<m-1 && j>0)
			if(grid[i+1][j-1] == 1)
			{ grid[i+1][j-1] = 9; totalCells1 += 1 + markAll(i+1, j-1);}
		if(i<m-1 && j<n-1)
			if(grid[i+1][j+1] == 1) 
			{ grid[i+1][j+1] = 9; totalCells1 += 1 + markAll(i+1, j+1);}
		return totalCells1;
	}
}


/*
#testcase 6
8
9
0 1 0 0 0 0 1 1 0
1 1 0 0 1 0 0 0 1
0 0 0 0 1 0 1 0 0
0 1 1 1 0 1 0 1 1
0 1 1 1 0 0 1 1 0
0 1 0 1 1 0 1 1 0
0 1 0 0 1 1 0 1 1
1 0 1 1 1 1 0 0 0

29
*/