package lab_03;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int arrayLength = scanner.nextInt();
        int[] myIntArray = new int[arrayLength];
        System.out.print("Please enter " + arrayLength + " integers in the array: ");
        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = scanner.nextInt();
        }
        for (int index = 0; index < arrayLength - 1; index++) {
            for (int j = index + 1; j < arrayLength; j++) {
                if (myIntArray[index] > myIntArray[j]) {
                    int temp = myIntArray[j];
                    myIntArray[j] = myIntArray[index];
                    myIntArray[index] = temp;
                }
            }
        }
        System.out.print("The array is sorted in ascending order: ");
        for (int index = 0; index < arrayLength; index++) {
            System.out.print(myIntArray[index] + " ");
        }
    }
}

