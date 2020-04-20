package arrayUtil;

public class ArrayUtil01 {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 2, 30};
        //01.01
        for (int b : array) {
            System.out.print(" " + b);
        }
        System.out.println(" ");
        //01.02
        for (int numbers = 0; numbers < array.length; numbers++) {

            System.out.print(" " + array[numbers]);
        }
        System.out.println(" ");
        //02
        int max = array[0];
        for (int a = 0; a < array.length; a++) {
            if (max < array[a]) {
                max = array[a];
            }
        }
        System.out.print(max);
        //03
        System.out.println(" ");
        int min = array[0];
        for (int a = 0; a < array.length; a++) {

            if (min > array[a])
                min = array[a];
        }
        System.out.println(min);
        //04
        for (int a = 0; a < array.length; a++) {
            if (array[a] % 2 == 0)
                System.out.print(" " + array[a]);
        }
        System.out.println(" ");
        //05
        for (int c = 0; c < array.length; c++) {
            if (array[c] % 2 != 0)
                System.out.print(" " + array[c]);
        }
        System.out.println(" ");
        //06
        int d = 0;
        for (int c = 0; c < array.length; c++) {
            if (array[c] % 2 == 0) {
                d++;
            }
        }
        System.out.print(" " + d);
        System.out.println(" ");
        //07
        int e = 0;
        for (int c = 0; c < array.length; c++) {
            if (array[c] % 2 != 0) {
                e++;
            }
        }
        System.out.print(" " + e);
        System.out.println(" ");
        //08
        int a = 0;
        for (int i = 0; i < array.length; i++)
            a = array[i] + a;
        int c = a / array.length;
        System.out.println(" " + a);
        //09
        int sun = 0;
        for (int i = 0; i < array.length; i++) {
            sun = array[i];
            System.out.print(" " + sun);
        }
    }

}


