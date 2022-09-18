package lab_03;

import java.util.Scanner;

public class FindMinAndMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int arrayLength = scanner.nextInt();
        int[] myIntArray = new int[arrayLength];
        System.out.print("Please enter " + arrayLength + " integers in the array: ");
        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = scanner.nextInt();
        }
        int minNumber = myIntArray[0];
        int maxNumber = myIntArray[0];
        for (int index = 1; index < arrayLength; index++) {
            if (minNumber > myIntArray[index]) {
                minNumber = myIntArray[index];
            }
            if (maxNumber < myIntArray[index]) {
                maxNumber = myIntArray[index];
            }
        }
        System.out.println("Max value is: " + maxNumber);
        System.out.println("Min value is: " + minNumber);
    }
}
