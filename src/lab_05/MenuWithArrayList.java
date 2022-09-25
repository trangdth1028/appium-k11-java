package lab_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuWithArrayList {
    public static void main(String[] args) {
        int option;
        List<Integer> myArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------- MENU -------------");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("6. Exit");
        while (true) {
            System.out.print("\nPlease choose an item: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Please enter the number in the array list: ");
                    Scanner scanner1 = new Scanner(System.in);
                    int number = scanner1.nextInt();
                    myArrayList.add(number);
                    break;
                case 2:
                    if (myArrayList.isEmpty()) {
                        System.out.println("List has no value!");
                    } else {
                        System.out.println("Your list of numbers includes " + myArrayList);
                    }
                    break;
                case 3:
                    int maxNumber = myArrayList.get(0);
                    for (int index = 1; index < myArrayList.size(); index++) {
                        if (maxNumber < myArrayList.get(index)) {
                            maxNumber = myArrayList.get(index);
                        }
                    }
                    System.out.println("Max value is: " + maxNumber);
                    break;
                case 4:
                    int minNumber = myArrayList.get(0);
                    for (int index = 1; index < myArrayList.size(); index++) {
                        if (minNumber > myArrayList.get(index)) {
                            minNumber = myArrayList.get(index);
                        }
                    }
                    System.out.println("Min value is: " + minNumber);
                    break;
                case 5:
                    if (myArrayList.isEmpty()) {
                        System.out.println("List has no value!");
                    } else {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Please enter a number to search: ");
                        int searchNum = scanner2.nextInt();
                        if (myArrayList.contains(searchNum)) {
                            System.out.println("The number " + searchNum + " is at index " + myArrayList.indexOf(searchNum));
                        } else {
                            System.out.println("The number " + searchNum + " does not exist in the array");
                        }
                    }
                    break;
                case 6:
                    return;
            }
        }
    }
}
