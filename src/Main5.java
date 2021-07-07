import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int[] arr1 = getArr();
        System.out.printf("\nValue min in array is: \t%d\t at index\t%d", min(arr1)[0], min(arr1)[1]);
    }

    static int[] getArr() {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("\nInput size your array");
        size = input.nextInt();
        int setarr[] = new int[size];
        System.out.println("Element in araay:");
        for (int i = 0; i < size; i++) {
            setarr[i] = (int) Math.round(Math.random() * 100);
            System.out.print(setarr[i] + "\t");
        }
        return setarr;
    }

    static void displayArr(int arr[]) {
        System.out.println("\nElement in araay:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static int[] min(int arr[]) {
        int result[] = new int[2];
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        result[0] = min;
        result[1] = index;
        return result;
    }

}
