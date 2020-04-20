package arrayUtil;

public class ArrayUtil {
    void print(int[] array) {
        for (int numbers = 0; numbers < array.length; numbers++) {

            System.out.print(" " + array[numbers]);
        }
        System.out.println(" ");
    }

    void printMax(int[] array) {
        int max = array[0];
        for (int a = 0; a < array.length; a++) {
            if (max < array[a]) {
                max = array[a];
            }
        }
        System.out.print(max);
        System.out.println(" ");
    }

    void printMin(int[] array) {
        int min = array[0];
        for (int a = 0; a < array.length; a++) {

            if (min > array[a])
                min = array[a];
        }
        System.out.println(min);
        // System.out.println(" ");
    }

    void printEvens(int[] array) {
        for (int a = 0; a < array.length; a++) {
            if (array[a] % 2 == 0)
                System.out.print(" " + array[a]);
        }
        System.out.println(" ");
    }

    void printCountOfEvens(int[] array) {
        for (int c = 0; c < array.length; c++) {
            if (array[c] % 2 != 0)
                System.out.print(" " + array[c]);
        }
        System.out.println(" ");
    }

    void printCountOfOdds(int[] array) {
        int d = 0;
        for (int c = 0; c < array.length; c++) {
            if (array[c] % 2 == 0) {
                d++;
            }
        }
        System.out.print(" " + d);
        System.out.println(" ");
    }

    void printSum(int[] array) {
        int e = 0;
        for (int c = 0; c < array.length; c++) {
            if (array[c] % 2 != 0) {
                e++;
            }
        }
        System.out.print(" " + e);
        System.out.println(" ");
    }

    void printAvg(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++)
            a = array[i] + a;
        int c = a / array.length;
        System.out.println(" " + a);
    }
}