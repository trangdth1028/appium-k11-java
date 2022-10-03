package lab_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        Employee fte = new FTE();
        Employee contractor = new Contractor();
        List<Employee> myEmployeeList = new ArrayList<>();
        System.out.print("Please enter the number of full-time employees: ");
        Scanner scanner = new Scanner(System.in);
        int fteNumber = scanner.nextInt();
        for (int index = 0; index < fteNumber; index++) {
            myEmployeeList.add(fte);
        }
        System.out.print("Please enter the number of contractor employees: ");
        Scanner scanner1 = new Scanner(System.in);
        int contractorNumber = scanner1.nextInt();
        for (int index = 0; index < contractorNumber; index++) {
            myEmployeeList.add(contractor);
        }
        int totalSalary = employeeController.totalSalary(myEmployeeList);
        System.out.println("Total salary is " + totalSalary);
    }
}
