package company;
import visitor.Visitor;

public class Department implements Element {

    private String name;
    private Employee[] employees;

    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() { return name; }
    public Employee[] getEmployees() { return employees; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDepartment(this);
    }
}
