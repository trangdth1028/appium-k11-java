package lab_08;

public class FTE extends Employee {
    public FTE(int salary) {
        super(salary);
    }

    public FTE() {
        super();
    }

    @Override
    public int getSalary() {
        return 50000;
    }
}
