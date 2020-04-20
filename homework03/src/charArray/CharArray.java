package charArray;

public class CharArray {
    public void trim() {
        char[] text = {' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' '};

        int beg = 0;
        int end = text.length - 1;
        while (text[beg] == ' ') {
            beg++;
        }
        while (text[end] == ' ') {
            end--;
        }

        char[] result = new char[(end - beg) + 1];
        int index = 0;
        for (int i = beg; i <= end; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }

    void printCount(char[] array, char symbol) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        int quantity = 0;
        for (int i : array) {
            if (i == symbol) {
                quantity++;
            }
        }
        System.out.println(quantity);

    }

    void middleTwo(char[] array) {
        int i = array.length / 2;
        System.out.println(array[i - 1] + " " + array[i]);
    }

    void printLy(char[] array) {
        char[] bolo = {'b', 'o', 'l', 'o', 'l', 'a'};
        char noend = 'l';
        char end1 = 'y';
        boolean t = false;
        int r = bolo.length - 2;
        int theend = bolo.length - 1;
        if (end1 == bolo[theend] && noend == bolo[r]) {
            t = true;
        }
        System.out.println(t);

    }

    void bobThere(char[] array) {
        char[] bol = {'b', '1', 'l', 'b', 'o', 'b'};
        boolean l = false;
        for (int b = 1; b < bol.length - 1; b++) {
            if (bol[b - 1] == 'b' && bol[b + 1] == 'b') {
                l = true;
            }
        }
        System.out.println(l);
    }

    //01
    void printReversed(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println(" ");
    }

    //02
    void reverseAndPrint(char[] array) {
        int begin = 0;
        int end = array.length - 1;
        char temp;
        while (end > begin) {
            temp = array[begin];
            array[begin] = array[end];
            array[end] = temp;
            end--;
            begin++;
        }
        System.out.println(array);
    }

    //05
    void endOrFront(char[] array, boolean b) {
        if (b) {
            System.out.println(array[0]);
        } else {
            System.out.println(array[array.length - 1]);
        }
    }

    //04
    void repeatEnd(char[] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = array.length - n; j < array.length; j++) {
                System.out.print(array[j]);
            }
        }
    }

    //03
    void mixArrays(char[] array1, char[] array2) {
        int maxout;
        if (array1.length > array2.length) {
            maxout = array1.length;
        } else {
            maxout = array2.length;
        }
        for (int i = 0; i < maxout; i++) {
            if (i < array1.length) {
                System.out.print(array1[i]);
            }
            if (i < array2.length) {
                System.out.println(array2[i]);
            }
        }
    }
}
//yang old