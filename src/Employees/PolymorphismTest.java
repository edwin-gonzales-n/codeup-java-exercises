package Employees;

public class PolymorphismTest {
    // assign superClass reference to superClass variable
    public static void main(String[] args) {
        CommissionEmployee2 commissionEmployee = new CommissionEmployee2("ed","Gza","999-99-9999",10000,.06);
        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee3 basePlusCommissionEmployee = new BasePlusCommissionEmployee3("Bob","Lewis","333-33-3333",5000,.04,300);

        //invoke toString on superclass obejct using superClass variable
        System.out.printf("\n%s %s:\n\n%s\n\n",
                "Call ComissingEmployee2's toString with superclass reference",
                "to superclass object", commissionEmployee.toString());

        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusCommissionEmployee3's toString with subclass reference",
                "to superclass object", basePlusCommissionEmployee.toString());

        CommissionEmployee2 comissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusComissingEmployee3's toString with superclass reference",
                "to superclass object", comissionEmployee2.toString());
    }
}
