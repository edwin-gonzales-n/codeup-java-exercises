package Employees;

public class CommissionEmployeePoly extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployeePoly(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = ( commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
    }

    @Override
    public double getPaymentAmount() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %,.2f",
                "Commissioned Employee", super.toString(),
                "Gross Sales", getGrossSales(),
                "Commissioned Rate", getCommissionRate());
    }
}
