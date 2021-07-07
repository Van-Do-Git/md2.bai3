import java.util.Scanner;

public class TotalInColumn {
    public static void main(String[] args) {
        int arr[][] = FindMaxInArr2Way.set2wayArrSquare();
        Scanner input = new Scanner(System.in);
        System.out.println("Input the column this you want to total");
        int column = input.nextInt();
        FindMaxInArr2Way.display2wayarr(arr);
        System.out.printf("The total in column:\t%d is :\t%.2f",column,totalColumn(arr,column));
    }

    static double totalColumn(int arr[][], int column) {
        if (column < arr[0].length) {
            double total = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == column)
                        total += arr[i][j];
                }
            }
            return total;
        }
        return 0;
    }
}
