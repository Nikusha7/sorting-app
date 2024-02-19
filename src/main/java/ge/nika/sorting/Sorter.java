package ge.nika.sorting;

public class Sorter {
    public int[] sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int length = array.length;
        if (length > 1) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }

}
