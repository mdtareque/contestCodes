package utils;

/**
 * @author mtk
 *
 */

public class ExponentialOfNumber {

    // Exponentfactor must be positive.
    public static int findExponentialOfNumber(int number, int exponentFactor) {
        int result = 1;
        int numberOfMultiplications = 0;
        while(exponentFactor > 0) {
            if((exponentFactor % 2) == 1) {
                result = result * number;
                numberOfMultiplications++;
            }
            exponentFactor = exponentFactor / 2;
            numberOfMultiplications++;
            number *= number;
        }
        System.out.println("Number of multiplications needed for exp(" + number + ", " + exponentFactor + ") : "
                + numberOfMultiplications);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findExponentialOfNumber(2, 9));
//        System.out.println(findExponentialOfNumber(4, 4));
//        System.out.println(findExponentialOfNumber(2, 3));
//        System.out.println(findExponentialOfNumber(2, 6));
//        System.out.println(findExponentialOfNumber(3, 3));
    }
}
