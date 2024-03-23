

import java.util.Scanner;



public class maincustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek customer dengan data awal
        Customer customer = new Customer(3802345678l, "mas dandy", 50000, 1234);
       Customer customer2 = new Customer(5677990011l, null, 0, 0);
        int enteredAccountNumber;
        int enteredPin;

        System.out.println("Selamat datang di Tiny Supermarket!");

        do {
            System.out.print("Masukkan nomor akun Anda: ");
            enteredAccountNumber = scanner.nextInt();
            System.out.print("Masukkan PIN Anda: ");
            enteredPin = scanner.nextInt();
        } while (!customer.verifyPin(enteredPin) && customer.getBalance() > 10000);

        if (customer.getBalance() < 10000) {
            System.out.println("Saldo minimal tidak terpenuhi. Transaksi dibatalkan.");
            return;
        }

        System.out.println("Halo, " + customer.getName() + "!");

        System.out.println("Menu: ");
        System.out.println("1. Top Up");
        System.out.println("2. Pembelian");

        System.out.print("Pilih menu: ");
        int menuChoice = scanner.nextInt();

        switch (menuChoice) {
            case 1:
                System.out.print("Masukkan jumlah top up: ");
                double topUpAmount = scanner.nextDouble();
                customer.topUp(topUpAmount);
                break;
            case 2:
                System.out.print("Masukkan jumlah pembelian: ");
                double purchaseAmount = scanner.nextDouble();
                customer.purchase(purchaseAmount);
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    }
}

