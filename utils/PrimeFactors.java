package utils;

/**
 * @author mtk
 *
 */
public class PrimeFactors {

    public static void printPrimeFactorsOfNumber(long inputNumber) {
        for(int i = 2; i <= (inputNumber / 2); i++) {
            while((inputNumber % i) == 0) {
                System.out.print(i + " ");
                inputNumber = inputNumber / i;
            }
        }
        if(inputNumber > 1) {
            System.out.print(inputNumber);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        printPrimeFactorsOfNumber(342_100_733_900L);
        System.out.println(System.currentTimeMillis() - start);
    }
}
