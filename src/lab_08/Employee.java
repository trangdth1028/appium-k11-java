package lab_08;

public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee() {

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", salary=" + salary +
                '}';
    }
}
