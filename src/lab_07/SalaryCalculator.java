package lab_07;

public class SalaryCalculator {
    public static void main(String[] args) {
        FTE fte = new FTE();
        Contractor contractor = new Contractor();
        int totalFtes = 3;
        int totalContractors = 2;
        //Total monthly salary
        int totalMonthlySalary = (totalFtes * fte.salary()) + (totalContractors * contractor.salary());
        System.out.println("Total monthly salary is: " + totalMonthlySalary);
    }
}
