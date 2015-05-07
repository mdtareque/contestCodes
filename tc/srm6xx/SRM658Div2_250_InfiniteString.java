package tc.srm6xx;

import static utils.MtkUtils.p;

/**
 * @author mtk
 * DONE
 */
public class SRM658Div2_250_InfiniteString {
    public static void main(String[] args) {
        InfiniteString i = new InfiniteString();
        p(i.equal("ababab", "abab"));
    }
}

class InfiniteString {
    static String EQ  = "Equal";
    static String NEQ = "Not equal";
    
    public static long gcd(long a, long b) {
        return(b == 0 ? a : gcd(b, a % b));
    }
    
    String equal(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        long gcdl = 0;
        if(sl > tl) {
            gcdl = gcd(sl, tl);
        } else {
            gcdl = gcd(tl, sl);
        }
        
        if(sl > tl) {
            for(int i = 0; i < sl; i += gcdl) {
                for(int j = 0; j < gcdl; ++j) {
                    if(s.charAt(j) != s.charAt(i + j)) { return NEQ; }
                }
            }
        } else {
            for(int i = 0; i < tl; i += gcdl) {
                for(int j = 0; j < gcdl; ++j) {
                    if(s.charAt(j) != t.charAt(i + j)) { return NEQ; }
                }
            }
        }
        return EQ;
    }
}
