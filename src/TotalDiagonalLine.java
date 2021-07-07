import java.util.Scanner;

public class TotalDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of square array are you want to set");
        int size = input.nextInt();
        int arr[][] = setNewSquareArr(size);
        FindMaxInArr2Way.display2wayarr(arr);
        System.out.println("Total Main Diagonal Line is:\t" + totalMainDiagonalLine(arr));
        System.out.println("\nTotal Extra Diagonal line is:\t" + totalExtraDiagonalLine(arr));
    }

    static int[][] setNewSquareArr(int length) {
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
        return arr;
    }

    static int totalMainDiagonalLine(int arr[][]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    total += arr[i][j];
            }
        }
        return total;
    }

    static int totalExtraDiagonalLine(int arr[][]) {
        int total = 0;
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == index - j)
                    total += arr[i][j];
            }
        }
        return total;
    }

}
