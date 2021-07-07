public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = Main5.getArr();
        int arr2[] = Main5.getArr();
        Main5.displayArr(mergeArray(arr1, arr2));
    }

    static int[] mergeArray(int arr1[], int arr2[]) {
        int size = arr1.length + arr2.length;
        int newArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            if (i < arr1.length) {
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[size - 1 - i];
            }
        }
        return newArr;
    }
}
