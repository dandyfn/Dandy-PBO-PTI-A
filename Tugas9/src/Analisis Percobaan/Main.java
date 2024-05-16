package dpraktek9;



public class Main {
    public static void main(String[] args) {
        // Create some invoices
        Invoice invoice1 = new Invoice("Laptop", 1, 7000);
        Invoice invoice2 = new Invoice("Mouse", 2, 50);
        Invoice invoice3 = new Invoice("Keyboard", 1, 100);

        // Create an array of invoices for the employee
        Invoice[] invoices = {invoice1, invoice2, invoice3};

        // Create an employee
        Employee employee = new Employee(12345, "Andi", 8000, invoices);

        // Display employee details and invoices
        System.out.println(employee);
    }
}
