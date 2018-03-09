package Employees;

public class BasePlusCommissionEmpPoly extends CommissionEmployeePoly{

    private double baseSalary;

    public BasePlusCommissionEmpPoly(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s: %s; %s: $s: $%,.2f",
                "Base Salaried", super.toString(),
                "Base Salary", getBaseSalary());
    }
}
