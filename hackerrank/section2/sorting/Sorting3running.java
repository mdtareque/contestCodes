package hackerrank.section2.sorting;

/**
 * @author mtk
 * url: https://www.hackerrank.com/challenges/quicksort1
 */
public class Sorting3running {

    private static void quickSortPartition(int[] ar) {
        assert (ar != null);
        int pivot = ar[0];
        boolean allDone = false;
        int leftIndex = 1;
        int rightIndex = ar.length - 1;
        int[] lesser = new int[ar.length], bigger = new int[ar.length];
        int lesserPtr = 0, biggerPtr = 0;

        for(int element : ar) {
            if(element < pivot) {
                lesser[lesserPtr++] = element;
            }
        }
        for(int element : ar) {
            if(element > pivot) {
                bigger[biggerPtr++] = element;
            }
        }

        printArray(lesser, lesserPtr);
        System.out.print(pivot + " ");
        printArray(bigger, biggerPtr);
        System.out.println();
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i = 0; i < s; i++) {
            ar[i] = in.nextInt();

        }*/
        int[] ar = new int[] { 4, 5, 3, 7, 2 };
        quickSortPartition(ar);
    }

    /**
     * @param lesser
     * @param lesserPtr
     */
    private static void printArray(int[] ar, int index) {
        for(int i = 0; i < index; i++) {
            System.out.print(ar[i] + " ");
        }
        
    }

    private static void printArray(int[] ar) {
        for(int n : ar) {
            System.out.print(n + " ");
        }
//        System.out.println("");
    }
    
}
