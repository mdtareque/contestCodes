package utils;

/**
 * @author mtk
 *
 */
public class SwapNumbers {
    
    public static void swapNumbersWithoutTemp(int x, int y) {
        System.out.println("Before swap: x = " + x + " y = " + y);
        x = y - x;
        y = y - x;
        x = x + y;
        System.out.println("After swap: x = " + x + " y = " + y);
    }
    
    public static void swapNumbersUsingXOR(int x, int y) {
        System.out.println("Before swap: x = " + x + " y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " y = " + y);
        
    }
    
    public static void main(String[] args) {
        swapNumbersUsingXOR(23, 8);
        swapNumbersWithoutTemp(23, 8);
    }
}
