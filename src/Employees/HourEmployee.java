package Employees;

public class HourEmployee extends Employee{
    private double wage;
    private double hours;

    public HourEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage); // validate hourly wage
        setHours(hours); // validate hours worked
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = (wage < 0.0) ? 0.0 : wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = ((hours >= 0.0) && (hours <= 168.0)) ? hours : 0.0;
    }

    // calculate earnings; orverride abstract method earnings in Employee


    @Override
    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Hourly Wage", getWage(),
                "Hours Worked", getHours());
    }
} // end class hourly employee
