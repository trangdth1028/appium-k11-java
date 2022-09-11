package lab_02;

import java.util.Scanner;

public class SuggestUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight (unit: kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Please enter your height (unit: m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        double weightGain = ((18.5 * weight) / bmi) - weight;
        double weightLoss = ((24.9 * weight) / bmi) - weight;
        if (bmi < 18.5) {
            System.out.printf("Result is Underweight (BMI = %f)\nYou should gain %f kg", bmi, weightGain);
        } else if (bmi < 24.9) {
            System.out.printf("Result is Normal weight (BMI = %f)", bmi);
        } else if (bmi < 29.9) {
            System.out.printf("Result is Overweight (BMI = %f)\nYou should gain %f kg", bmi, weightLoss);
        } else {
            System.out.printf("Result is Obesity (BMI = %f)\nYou should gain %f kg", bmi, weightLoss);
        }
    }
}
