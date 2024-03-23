

class Customer {
    private long angkaakun;
    private String nama;
    private double balance;
    private int pin;
    private int loginakun;

    public Customer(long accountNumber, String name, double balance, int pin) {
        this.angkaakun = accountNumber;
        this.nama = name;
        this.balance = balance;
        this.pin = pin;
        this.loginakun = 0;
    }

    public long getAccountNumber() {
        return angkaakun;
    }

    public String getName() {
        return nama;
    }

    public double getBalance() {
        return balance;
    }

    public boolean verifyPin(int enteredPin) {
        if (pin == enteredPin) {
            loginakun = 0;
            return true;
        } else {
            loginakun++;
            if (loginakun >= 3) {
                System.out.println("Akun Anda telah diblokir. Hubungi admin.");
            }
            return false;
        }
    }

    public void topUp(double amount) {
        balance += amount;
        System.out.println("Top up berhasil. Saldo sekarang: Rp" + balance);
    }

    public boolean purchase(double amount) {
        if (balance - amount < 10000) {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
            return false;
        }

        double cashback = 0;

        if (angkaakun / 100 == 38) { // Silver
            if (amount > 1000000) {
                cashback = 0.05 * amount;
            }
        } else if (angkaakun / 100 == 56) { // Gold
            if (amount > 1000000) {
                cashback = 0.07 * amount;
            }
            cashback += 0.02 * amount;
        } else if (angkaakun / 100 == 74) { // Platinum
            if (amount > 1000000) {
                cashback = 0.10 * amount;
            }
            cashback += 0.05 * amount;
        }

        balance -= amount;
        balance += cashback;

        System.out.println("Pembelian berhasil. Cashback: Rp" + cashback + ", Saldo sekarang: Rp" + balance);
        return true;
    }
}
