package Employees;

public class CommissionEmployee2 {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    //five argument constructor
    public CommissionEmployee2(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        //implicit call to object constructor occurs here
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        System.out.printf("\nCommissionedEmployee2 constructor:\n%s\n", this);
    }// end five-argument CommissionedEmployee2 constructor
    // GETTERS AND SETTERS
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

    public double getCommisionRate() {
        return commissionRate;
    }

    public void setCommisionRate(double commissionRate) {
        this.commissionRate = ( commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
    }
    //CALCULATE EARNINGS
    public double earnings() {
        return getCommisionRate() * getGrossSales(); // good Software Engineering practice.  Using the get methods to access its instance variables
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "CommissionEmployee", getFirstName(),getLastName(),
                "Social Security Number", getSocialSecurityNumber(),
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommisionRate());  // good software Engineering practice.  Subclass can now access the private variables of this superclass.
    }// end method toString
}//end class ComissionEmployee2
