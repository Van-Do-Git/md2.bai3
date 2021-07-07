import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int arr[] = Main5.getArr();
        int index;
        Scanner input = new Scanner(System.in);
        System.out.println("\nInput index you need delete a Element");
        index = input.nextInt();
        delete(arr,index);
        Main5.displayArr(arr);
    }

    static int[] delete(int arr[], int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Not found");
        } else {
            for (int i = index; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = arr[i + 1];
                }
            }
        }
        return arr;
    }
}
