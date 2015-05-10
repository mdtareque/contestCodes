package tc;

public class Aaagmnrs {
    public String[] anagrams(String[] a){
        String[] original = a;
        int[] map = null;
        for(int i=0; i<a.length; i++) {
            map = getMapCount(a[i]);
        }
        print(map);
        return original;
    }
    
    static int[] getMapCount(String s){
        int[] map = new int[26];
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            map[s.charAt(i) - 'a']++; 
        }
        return map;
    }
    static void print(int[] map){
        for(int i=0; i<map.length; i++){
            System.err.print(map[i]+" ");
        }
    }
}