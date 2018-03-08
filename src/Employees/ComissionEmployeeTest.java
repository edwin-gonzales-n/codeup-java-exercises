package Employees;

public class ComissionEmployeeTest {
    public static void main(String[] args) {
        // instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee("Ed", "Gonzales","111-11-1111",10000,.06);
        //get commission employee data
        System.out.println("Employee info obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is: ", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is: ", employee.getLastName());
        System.out.printf("%s %s\n", "SSN is: ", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is: ", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is: ", employee.getCommisionRate());

        //set gross sales
        employee.setGrossSales(500);
        employee.setCommisionRate(.1);

        System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee);
    }// end main method
}
