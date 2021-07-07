import java.util.Scanner;

public class FindMaxInArr2Way {
    public static void main(String[] args) {
        int arr[][] = set2wayArr();
        display2wayarr(arr);
        System.out.printf("\nmax Value of array is:\t%d", findMaxInArr2Way(arr));
    }

    static int findMaxInArr2Way(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    static int[][] set2wayArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input length of array");
        int length = input.nextInt();
        int arr[][] = new int[length][];
        for (int i = 0; i < length; i++) {
            arr[i] = new int[(int) Math.round(Math.random() * 8 + 1)];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
        return arr;
    }
    static void display2wayarr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
