package User_Input;

import java.util.Scanner;

public class UserInput_scanner_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");

        int age = scanner.nextInt();
        String CanIvote = (age > 18 ? "Yes" : "No");
        System.out.println(CanIvote);

    }
}
