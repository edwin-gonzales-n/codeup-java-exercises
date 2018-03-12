package Employees;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable payableObjects[] = new Payable[6];

        payableObjects[0] = new Invoice("01234","seat", 2,375.00);
        payableObjects[1] = new Invoice("56789","tire", 2,500.00);
        payableObjects[2] = new Invoice("10111","motor", 2,4000.00);
        payableObjects[3] = new Invoice("21314","shaft", 2,325.00);
        payableObjects[4] = new SalariedEmployee("Eddie","Franco","111-11-1111",800.00);
        payableObjects[5] = new SalariedEmployee("Lisa","Blank","222-22-2222",1800.00);

        System.out.println("Invoices and Employees processed polymorphically: \n");

        for(Payable currentPayable : payableObjects){
            System.out.printf("%s \n%s: $%,.2f\n\n", currentPayable.toString(), "Payment Due", currentPayable.getPaymentAmount());
        }
    }
}
