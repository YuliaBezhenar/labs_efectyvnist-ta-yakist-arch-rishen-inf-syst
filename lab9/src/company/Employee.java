package company;
import visitor.Visitor;

public class Employee implements Element {

    private String position;
    private double salary;
    private String name;

    public Employee(String position, double salary, String name) {
        this.position = position;
        this.salary = salary;
        this.name = name;
    }

    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public String getName() { return name; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEmployee(this);
    }
}
