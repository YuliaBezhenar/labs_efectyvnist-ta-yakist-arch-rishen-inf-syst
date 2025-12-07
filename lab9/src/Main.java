import company.*;
import visitor.*;

public class Main {
    public static void main(String[] args) {
        Employee[] salesEmployees = {
                new Employee("Sales Manager", 40000, "Yankivska H. A."),
                new Employee("Sales Specialist", 30000, "Bondar M. V.")
        };

        Employee[] itEmployees = {
                new Employee("Developer", 50000, "Bezhenar R. V."),
                new Employee("QA Engineer", 35000, "Koval O. A.")
        };

        Department sales = new Department("Sales", salesEmployees);
        Department it = new Department("IT", itEmployees);

        Company company = new Company("TechCorp", new Department[]{ sales, it });

        ReportVisitor visitor = new ReportVisitor();

        System.out.println("\nReport for a company");
        company.accept(visitor);


    }
}