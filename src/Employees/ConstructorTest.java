package Employees;

public class ConstructorTest {
    public static void main(String[] args) {
        CommissionEmployee2 employee1 = new CommissionEmployee2("Bob", "Marley", "333-33-333", 5000,.04);

        System.out.println();
        BasePlusCommissionEmployee4 employee2 = new BasePlusCommissionEmployee4("Papo", "Lucca","222-22-2222",2000,.06,800);

        System.out.println();
        BasePlusCommissionEmployee4 employee3 = new BasePlusCommissionEmployee4("Alfredo", "Linares", "444-44-4444",8000,.15,2000);
    } // end main
} // end class constructorTest
