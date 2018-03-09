package Employees;

public class PayrollSystemTestPoly {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourEmployee hourEmployee = new HourEmployee("Karen", "Price","222-22-2222",16.75,40);
        CommissionEmployeePoly commissionEmployee = new CommissionEmployeePoly("Sue","Jones","333-33-3333",10000,.06);
        BasePlusCommissionEmpPoly basePlusCommissionEmpPoly = new BasePlusCommissionEmpPoly("Bob", "Lewis","444-44-4444",5000,.04,300);

        System.out.println("Employees processed individually:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourEmployee, "earned", hourEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmpPoly, "earned", basePlusCommissionEmpPoly.earnings());

        // create a four element employee array
        Employee employees[] = new Employee[4];

        // initialize array with employees
        employees[0] = salariedEmployee;
        employees[1] = hourEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmpPoly;

        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString
            if(currentEmployee instanceof  BasePlusCommissionEmpPoly){
                //downcast Employee reference to BasePlusCommissionEmpPoly reference
                BasePlusCommissionEmpPoly employee = (BasePlusCommissionEmpPoly) currentEmployee;

                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary(1.10 * oldBaseSalary);
                System.out.printf("New base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());
            } // enf if statement
            System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
        } // end for loop

        //get type name of employees of each object in employees array
        for(int key = 0; key < employees.length; key ++){
            System.out.printf("Employee %d is a %s\n", key, employees[key].getClass().getName());
        }
    } // end main
} // end class PayrollSystemTestPoly
