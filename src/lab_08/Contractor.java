package lab_08;

public class Contractor extends Employee {
    public Contractor(int salary) {
        super(salary);
    }

    public Contractor() {

    }

    @Override
    public int getSalary() {
        return 40000;
    }
}
