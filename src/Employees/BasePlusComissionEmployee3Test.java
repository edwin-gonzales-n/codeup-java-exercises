package Employees;

public class BasePlusComissionEmployee3Test{
    public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee3 employee = new BasePlusCommissionEmployee3("Ed", "Gonzales","111-11-1111",5000,.04,300);
        //get commission employee data
        System.out.println("Employee info obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is: ", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is: ", employee.getLastName());
        System.out.printf("%s %s\n", "SSN is: ", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is: ", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is: ", employee.getCommisionRate());
        System.out.printf("%s %.2f\n", "Base Salary is: ", employee.getBaseSalary());

        employee.setBaseSalary(1000);
        System.out.printf("\n%s: \n\n%s\n",
                "Updated employee info obtained by toString",
                employee.toString());
    }//end main
}// end class BasePlusCommissionEmployeeTest
