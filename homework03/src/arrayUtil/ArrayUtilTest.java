package arrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 2, 30};
        ArrayUtil au = new ArrayUtil();
        au.print(array);
        au.printMax(array);
        au.printMin(array);
        au.printEvens(array);
        au.printCountOfEvens(array);
        au.printCountOfOdds(array);
        au.printSum(array);
        au.printAvg(array);
    }
}