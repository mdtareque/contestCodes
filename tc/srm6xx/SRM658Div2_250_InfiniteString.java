package tc.srm6xx;

import static utils.MtkUtils.p;

/**
 * @author mtk
 * BUG
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

    public String equal(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int smallerLen = 0, largerLen = 0;
        String smaller = "", larger = "";
        if(slen < tlen) {
            smallerLen = slen;
            smaller = s;
            largerLen = tlen;
            larger = t;
        } else {
            largerLen = slen;
            larger = s;
            smallerLen = tlen;
            smaller = t;
        }
        boolean allGood = true;
        System.out.println(largerLen);
        System.out.println(smallerLen);
//        if((largerLen % smallerLen) == 0) {
        
        for(int j = 0; j < largerLen;) {
            for(int i = 0; i < smallerLen;) {
                p("checking for " + i + ", " + j);
                if(smaller.charAt(i++) == larger.charAt(j++)) {
                    ;
                } else {
                    return NEQ;
                }
            }
        }
        return EQ;
        
//        }
        
/*        String[] tokens1 = s.split(s.charAt(0) + "");
        String[] tokens2 = t.split(t.charAt(0) + "");
        if((tokens1.length == tokens2.length) && (tokens1.length == 0)
                && (s.charAt(0) == t.charAt(0))) { return EQ; }

        return NEQ;
 */ }
}
