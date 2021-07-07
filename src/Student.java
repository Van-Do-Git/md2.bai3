import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        double arr[] = setScores();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t\t");
            if (arr[i] >= 5) {
                count += 1;
            }
        }
        System.out.println("\nThe number of students passing the exam is:\t"+count);
    }

    static double[] setScores() {
        double[] arr;
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input size lists student");
            size = input.nextInt();
            if (size > 30)
                System.out.println("You need input size smaller than 30");
        } while (size > 30);
        arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.round(Math.random() * 10);
        }
        return arr;
    }
}
