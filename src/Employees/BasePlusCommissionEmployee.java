package Employees;

public class BasePlusCommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;  //base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }
    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
    }

    public double getcommissionRate() {
        return commissionRate;
    }

    public void setcommissionRate(double commissionRate) {
        this.commissionRate = ( commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }

    //CALCULATE EARNINGS
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }
    // Return String representation of BasePlusCommissionEmployee
    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "CommissionEmployee", firstName,lastName,
                "Social Security Number", socialSecurityNumber,
                "Gross Sales", grossSales,
                "Commission Rate", commissionRate,
                "Base Salary", baseSalary);
    }// end method toString
}//end class BasePlusComissionEmployee
