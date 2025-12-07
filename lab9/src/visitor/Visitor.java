package visitor;

import company.Company;
import company.Department;
import company.Employee;

public interface Visitor {

    //methods for visiting every element
    void visitCompany(Company company);

    void visitDepartment(Department department);

    void visitEmployee(Employee employee);
}
