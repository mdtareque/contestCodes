package tc.srm6xx;

/**
 * @author mtk
 *
 */
// TODO

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SRM659Div2_250_FilipTheFrog {
    
    static void p(final Object o) {
        System.out.println(o);
    }

    public static void main(final String[] args) {
    	int[] positions;
    	int L;
    	positions = new int[]{17, 10, 22, 14, 6, 1, 2, 3};
    	L= 4;
    	FilipTheFrog f = new FilipTheFrog();
    	System.out.println(f.countReachableIslands(positions, L));
    }
}


class FilipTheFrog  {
	public int countReachableIslands(int[] positions, int L){
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[positions.length];
		int ans=1;
		visited[0] = true;
		q.add(positions[0]);
		while(!q.isEmpty()) {
			for(int i=0; i<positions.length; i++) {
				if(!visited[i] && Math.abs((q.peek() - positions[i])) <=L ) {
					visited[i] = true;
					q.add(positions[i]);
					ans++;
				}
			}
			q.poll();
		}
		
		return ans;
	}
}