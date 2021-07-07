import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Input size your array");
        size= input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= (int) Math.round(Math.random()*100);
        }
        int max = arr[0];
        int index = 0;
        System.out.print("List element of array:\t");
        for (int i = 1; i < size; i++) {
            System.out.print(arr[i]+"\t");
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }

        System.out.printf("\n%d is max in array, index of max is:\t%d",max,index);
    }
}
