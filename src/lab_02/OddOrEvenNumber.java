package lab_02;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.printf("The number " + num + " is even number");
        } else {
            System.out.println("The number " + num + " is odd number");
        }
    }
}
