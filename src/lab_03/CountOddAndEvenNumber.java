package lab_03;

import java.util.Scanner;

public class CountOddAndEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int arrayLength = scanner.nextInt();
        int[] myIntArray = new int[arrayLength];
        System.out.print("Please enter " + arrayLength + " integers in the array: ");
        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = scanner.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        for (int index = 0; index < arrayLength; index++) {
            if (myIntArray[index] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.printf("There are %d even and %d odd numbers in the array that you entered", evenCount, oddCount);
    }
}
