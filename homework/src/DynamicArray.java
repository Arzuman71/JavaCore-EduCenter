public class DynamicArray {
    //սա մեր հիմնական մասիվն է ,որտեղ պահելու ենք ավելացվօղ ելեմենտները
    private int[] array = new int[10];

    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստւգել եթե մասիվի մեջ տեղ չկա կանչել extend()
    //և ավելացնել
    public void add(int value) {

        if (size < array.length) {
            array[size++] = value;
        } else {
            extend();
            array[size++] = value;
        }

    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է,վեռադարձնել
    // մասիվի index-երորդ  էլեմենտը հակառակ դեպքւմ վերեդերձնել -1:
    public int getByIndex(int index) {
        return index >= 0 && index < array.length ? array[index] : -1;
    }

    //1. ստեղծել հին մասիվց 10 էլեմենտ մեծ մասիվ
    //2. քցել հին մասիվի էլեմենտները նօրի մեջ
    //3. հին մասիվի հղւմը կապեմք նօր մասիվի հղման հետ:
    private void extend() {
        int temp[] = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;

    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
        System.out.println(" ");
    }
    //վերադարձնել ավելացված թվերից ամենամեծը

    public int max() {
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //վերադարձնել ավելացված թվերից ամենափոքրը
    public int min() {
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //մասիվից ջնջում ենք ինդեքսի տակ ընկած էլեմանտը, հետո տպելւց մասիվի բոլոր էլեմենտները կտպի իրի կողք, իսկ ջնջվածը ոչ
    public void deleteByIndex(int index) {
       // int temp = array[size - 1];
        // array[size - 1] = array[index];
        //array[index] = temp;
        // size--;
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    //մասիվից ջնջում ենք տրված value-ին հավասար բոլոր էլեմանտը
    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                deleteByIndex(i);
            }
            System.out.print(array[i]);
        }
    }

    //մասիվից ջնջում ենք տրված value-ին հավասար միայն առաջին էլեմանտը:
    public void deletByValueFirst(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                deleteByIndex(i);
                break;
            }
        }

    }

    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և endIndex-ի,որն էլ կվերադարձնե, տեստի մեջ կտպենք
    public int[] subArray(int startIndex, int endIndex) {
        int result[] = new int[endIndex - startIndex + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = array[i];
        }

        return result;

    }

    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և մինչև վերջին էլեմենտը,որն էլ կվերադարձնե, տեստի մեջ կտպենք
    public int[] subArray(int startIndex) {
        if (startIndex < 0 || startIndex >= size) {
            System.out.println("սխալ ինդեքս");
            return null;
        }
        int[] result = new int[size - startIndex];
        int index = 0;
        for (int i = startIndex; i < size; i++) {
            result[index++] = array[i];
        }
        return result;
    }
}