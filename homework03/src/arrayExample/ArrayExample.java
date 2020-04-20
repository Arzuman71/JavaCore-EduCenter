package arrayExample;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 6, 8, 4, 11, 6, 77, 44};
        int x = 44;

        boolean isExists = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                isExists = true;
            }
        }
        System.out.println(isExists);
        System.out.println("------------");

        int indexOfX = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                indexOfX = i;
            }
        }
        System.out.println(indexOfX);
        System.out.println("------------");
        int index = 4;
        System.out.println(array[index]);
        System.out.println("------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + "թիվը կրկնվում է");
                }
            }
        }
        System.out.println("------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------");
        System.out.println(array[array.length - 2]);
        System.out.println("------------");
        array = new int[]{76, 6, 8, 20, 11, 6, 77, 44};

        int max = array[0];
        int secMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                secMax = max;
                max = array[i];
            } else {
                if (array[i] != max && array[i] > secMax) {
                    secMax = array[i];
                }
            }
        }
        System.out.println(secMax);

    }
}
