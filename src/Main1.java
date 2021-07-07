import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input array size");
            size = input.nextInt();
        } while (size > 20);
        int arr[] = new int[size];
        int newArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random() * 100 + 1);
            newArr[size-1-i]=arr[i];
        }
        System.out.printf("%-25s%s", "Elements in array: ", "");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.printf("\n%-25s%s", "Elements in New array: ", "");
        for (int i = 0; i < size; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
