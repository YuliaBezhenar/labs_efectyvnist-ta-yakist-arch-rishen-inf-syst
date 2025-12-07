package visitor;

import company.*;

//class concrete visitor - for creating payment report
public class ReportVisitor implements Visitor {

    @Override
    public void visitCompany(Company company) {
        System.out.println("Company " + company.getName() + "Payment Report");
        for (Department d: company.getDepartments()) {
            d.accept(this);
        }
    }

    @Override
    public void visitDepartment(Department department) {
        System.out.println("Department: " + department.getName());

        for (Employee e: department.getEmployees()) {
            e.accept(this);
        }
    }

    @Override
    public void visitEmployee(Employee employee) {
        System.out.println(" - " + employee.getPosition() + ", " + employee.getName() + ", salary: " + employee.getSalary());
    }

}
