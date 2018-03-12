package Employees;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    //four argument constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(salary);
    }

    //set salary
    public void setWeeklySalary(double salary){
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee { " + super.toString() +
                " weeklySalary = " + getWeeklySalary() +
                '}';
    }
}
