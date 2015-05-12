package hackerrank.section1.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/the-love-letter-mystery
 */
public class WarmUp7LoveLetter {
    
    static void p(final Object o) {
        System.out.println(o);
    }
    
    public static void main(final String[] args) {
        String input = "4\r\n" + "abc\r\n" + "abcba\r\n" + "abcd\r\n" + "cba\r\n" + "";
        final Scanner in = new Scanner(new ByteArrayInputStream(input.getBytes()));
//        final Scanner in = new Scanner(System.in);
        int T;
//        p(isPalindrom("aa"));
//        p(isPalindrom("abdfa"));
//        p(isPalindrom("abdcdba"));
        String a;
        T = Integer.parseInt(in.nextLine());
        for(int i = 0; i < T; i++) {
            a = in.nextLine();
            p(minimumNumberOfOperationsToMakePalindrome(a));
        }
    }

    static boolean isPalindrom(String s) {
        for(int i = 0; i < (s.length() / 2); i++) {
            if(s.charAt(i) == s.charAt(s.length() - i - 1)) {
                ;
            } else {
                return false;
            }
        }
        return true;
    }
    
    /**
     * @param a
     * @return
     */
    private static Object minimumNumberOfOperationsToMakePalindrome(String a) {
        int min = 0;
        for(int i = 0; i < (a.length() / 2); i++) {
            if(a.charAt(i) != a.charAt(a.length() - i - 1)) {
                min += Math.abs(a.charAt(i) - a.charAt(a.length() - i - 1));
            }
        }
        return min;
    }
}

/*
4
abc
abcba
abcd
cba
 */
