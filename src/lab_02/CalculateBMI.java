package lab_02;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight (unit: kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Please enter your height (unit: m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.printf("Result is Underweight (BMI = %f)", bmi);
        } else if (bmi < 24.9) {
            System.out.printf("Result is Normal weight (BMI = %f)", bmi);
        } else if (bmi < 29.9) {
            System.out.printf("Result is Overweight (BMI = %f)", bmi);
        } else {
            System.out.printf("Result is Obesity (BMI = %f)", bmi);
        }
    }
}
