package hackerrank.section1.warmup;

import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/utopian-tree/forum
 *
 * Bitwise shortcut:
 * <pre>
 * There is a pattern on the height every year.

original height: 1

year 1 (2 cycles) : 1*2+1 = 3
year 2 (4 cycles) : 3*2+1 = 7
year 3 (6 cycles) : 7*2+1 = 15
year 4 (8 cycles) : 15*2+1 = 31
year 5 (10 cycles) : 31*2+1 = 63

and you can notice the value in binary is like this

year 1 (2 cycles) : 1*2+1 = 3     ->      11
year 2 (4 cycles) : 3*2+1 = 7     ->     111
year 3 (6 cycles) : 7*2+1 = 15    ->    1111
year 4 (8 cycles) : 15*2+1 = 31   ->   11111
year 5 (10 cycles) : 31*2+1 = 63  ->  111111


you can get the answer by putting 1 as much as (year + 1).
how to make this? shift 1 by (year + 1) and subtract 1.

straight forward bit calculation is this:

(1<<((N>>1)+1))-1
 * N>>1 : devide N by 2 to get year
1 << (year+1) : if year is 5, it will make 1000000
-1 will make 1000000 to 111111.

if cycle is odd, that means the tree will be doubled again.

((1<<((N>>1)+1))-1) << n%2


This is another fomulation using NOT instead
~(~1<<(n>>1)) << n%2
 * </pre>
 */
// DONE
public class WarmUp1UtopianTree {

    static void p(final Object o) {
        System.out.println(o);
    }
    
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int t, growthCycles;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            growthCycles = in.nextInt();
            p(getUtopianTreeHeight(growthCycles));
        }

    }
    
    /**
     * @param growthCycles
     * @return
     */
    private static int getUtopianTreeHeight(final int growthCycles) {
        int totalHeight = 1;
        for (int i = 0; i < growthCycles; i++) {
            if ((i % 2) == 0) {
                totalHeight *= 2;
            } else {
                totalHeight++;
            }
        }
        return totalHeight;
    }
}
