package dpraktek9;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0.0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public String toString() {
        StringBuilder invoiceDetails = new StringBuilder();
        for (Invoice invoice : invoices) {
            invoiceDetails.append(invoice.toString()).append("\n");
        }
        return String.format("Employee: %s (ID: %d)\nMonthly Salary: %d\nRemaining Salary after deductions: %.2f\nInvoice Details:\n%s",
                name, registrationNumber, salaryPerMonth, getPayableAmount(), invoiceDetails.toString());
    }
}

