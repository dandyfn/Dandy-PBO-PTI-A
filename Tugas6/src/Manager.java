package dpraktek6;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    // Setter dan Getter
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    // Method untuk mendapatkan tunjangan
    @Override
    public double getBonus() {
        // Menambahkan tunjangan 10% dari gaji
        return super.getBonus() + (0.10 * getGaji());
    }

    // Method untuk menampilkan informasi manager
    @Override
    public String toString() {
        return super.toString() + ", Departemen: " + departemen;
    }

    // Main method untuk menguji kelas Manager
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", true, "123456789", true, 8000, LocalDate.of(2010, 1, 1), 2, "Keuangan");

        System.out.println("Informasi Manager:");
        System.out.println(manager);
        System.out.println("Bonus: $" + manager.getBonus());
        System.out.println("Total Pendapatan: $" + manager.getTotalPendapatan());
    }
}
