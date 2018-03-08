package Employees;

public class BasePlusCommissionEmployee2 extends CommissionEmployee{
    private double baseSalary;  //salary per week

    public BasePlusCommissionEmployee2
            (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary) {
        // explicit call to superclass CommissionEmployee constructor
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);

        setBaseSalary(baseSalary);  // validate and stores baseSalary value to setBaseSalary
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }

    //CALCULATE EARNINGS
    public double earnings() {
        return baseSalary + (commisionRate * grossSales);
    }

    // Return String representation of BasePlusCommissionEmployee
    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "CommissionEmployee", firstName,lastName,
                "Social Security Number", socialSecurityNumber,
                "Gross Sales", grossSales,
                "Commission Rate", commisionRate,
                "Base Salary", baseSalary);
    }// end method toString
}
