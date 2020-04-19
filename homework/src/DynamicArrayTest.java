public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(1);
        da.add(1);
        da.add(2);
        da.add(2);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);
        da.add(717);
        da.print();
        System.out.print(da.getByIndex(9));
        System.out.println();
        System.out.println(da.max());
        System.out.println(da.min());
        System.out.println();
        da.deleteByIndex(10);
        da.deleteByValue(1);
        da.deletByValueFirst(2);
        System.out.println();
        for (int i : da.subArray(4, 4)) {
            System.out.println(i);
            System.out.println("------");
        }
        for (int i : da.subArray(4)) {
            System.out.print(i);
        }

    }
}
