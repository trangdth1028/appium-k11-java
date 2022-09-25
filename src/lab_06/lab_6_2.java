package lab_06;

import java.util.Scanner;

public class lab_6_2 {
    /*
        String myPassword = "password123";
        Allow user to input maximum 3 times
     */
    public static void main(String[] args) {
        String myPassword = "password123";
        int inputTimes = 0;
        while (inputTimes < 3) {
            System.out.print("Please enter your password: ");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            if (password.equals(myPassword)) {
                System.out.println("Successful login!");
                break;
            } else {
                inputTimes++;
                System.out.println("Password is not correct. Please re-enter!");
            }
        }
        if (inputTimes == 3) {
            System.out.println("You have entered wrong 3 times. Please try again later!");
        }
    }
}
