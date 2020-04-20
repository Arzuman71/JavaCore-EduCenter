package charArray;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] array = {'b', 'o', 'l', 'o', 'l', 'a'};
        char[] array1 = {'i', 's', ' ', 'o', 'k', 'a', 'y', '?'};
        char[] array2 = {'i', 's', ' ', 'o', 'k', 'a', 'y', '?', '1', '2', '3'};
        CharArray br = new CharArray();
        br.trim();
        br.printCount(array, 'a');
        br.middleTwo(array);
        br.printLy(array);
        br.bobThere(array);
        br.printReversed(array);
        br.reverseAndPrint(array);
        br.endOrFront(array, true);
        br.repeatEnd(array, array.length);
        br.mixArrays(array1, array2);
    }
}
