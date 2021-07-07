import java.util.Scanner;

public class AddnewElement {
    public static void main(String[] args) {
        int arr[] = Main5.getArr();
        int index;
        int element;
        Scanner input = new Scanner(System.in);
        System.out.println("\nInput index you need Add a Element");
        index = input.nextInt();
        System.out.println("\nInput the Value of Element");
        element = input.nextInt();
        Main5.displayArr(addNewElement(arr,index,element));
    }

    static int[] addNewElement(int arr[], int index, int element) {
        if (index < 0 || index > arr.length) {
            System.out.println("Undifile");
        } else {
            int newArr[] = new int[arr.length + 1];
            for (int i = 0; i < arr.length + 1; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else if (i == index) {
                    newArr[i] = element;
                } else {
                    newArr[i] = arr[i - 1];
                }
            }
            return newArr;
        }
        return arr;
    }
}
