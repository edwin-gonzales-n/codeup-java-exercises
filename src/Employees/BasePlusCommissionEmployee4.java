package Employees;

public class BasePlusCommissionEmployee4 extends CommissionEmployee2{
    private double baseSalary;  //salary per week

    public BasePlusCommissionEmployee4
            (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary) {
        // explicit call to superclass CommissionEmployee constructor
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
        setBaseSalary(baseSalary);  // validate and stores baseSalary value to setBaseSalary
        System.out.printf("" +
                "\nBasePlusCommissionEmployee4 constructor: \n%s\n", this);
    }  // end local constructor
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }

    //CALCULATE EARNINGS
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // Return String representation of BasePlusCommissionEmployee
    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "CommissionEmployee", getFirstName(),getLastName(),
                "Social Security Number", getSocialSecurityNumber(),
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommisionRate(),
                "Base Salary", getBaseSalary());
    }// end method toString
}
