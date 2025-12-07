package company;
import visitor.Visitor;

public class Company implements Element {

    private String name;
    private Department[] departments;

    public Company(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() { return name; }
    public Department[] getDepartments() { return departments; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }
}
