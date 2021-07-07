import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String students[] = {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C",
                "Nguyen Van D", "Nguyen Van E", "Nguyen Van F", "Nguyen Van G", "Nguyen Van F",};
        boolean isExist = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Input name you need search:");
        String inputName = input.nextLine();
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(inputName)){
                System.out.printf("%s:\t Has index in the lists student:\t %d",students[i],i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Not found:\t" + inputName);
        }
    }
}
