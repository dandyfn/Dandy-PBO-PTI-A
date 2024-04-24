package dpraktek6;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // Setter dan Getter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    // Method untuk mendapatkan bonus berdasarkan lama bekerja
    public double getBonus() {
        LocalDate currentDate = LocalDate.now();
        int tahunBekerja = currentDate.getYear() - tahunMasuk.getYear();

        if (tahunBekerja >= 0 && tahunBekerja <= 5) {
            return 0.05 * gaji;
        } else if (tahunBekerja > 5 && tahunBekerja <= 10) {
            return 0.1 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    // Method untuk mendapatkan total pendapatan termasuk gaji, bonus, dan tunjangan anak
    public double getTotalPendapatan() {
        return gaji + getBonus() + (jumlahAnak * 20);
    }

    // Method untuk menampilkan informasi pekerja
    @Override
    public String toString() {
        return super.toString() + ", Tahun Masuk: " + tahunMasuk.getYear() + ", Jumlah Anak: " + jumlahAnak + ", Gaji: $" + gaji;
    }

    // Main method untuk menguji kelas Pekerja
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Alfa", true, "123456789", true, 5000, LocalDate.of(2022, 1, 1), 2);
        Pekerja pekerja1 = new Pekerja("Risi", true, "123456789", true, 5000, LocalDate.of(2015, 1, 1),0);
        Pekerja pekerja2 = new Pekerja("Nata", true, "123456789", true, 5000, LocalDate.of(2004, 1, 1), 10);

        System.out.println("Informasi Pekerja:");
        System.out.println(pekerja);
        System.out.println("Bonus: $" + pekerja.getBonus());
        System.out.println("Total Pendapatan: $" + pekerja.getTotalPendapatan());
        System.out.println();
        System.out.println(pekerja1);
        System.out.println("Bonus: $" + pekerja.getBonus());
        System.out.println("Total Pendapatan: $" + pekerja.getTotalPendapatan());
        System.out.println();
        System.out.println(pekerja2);
        System.out.println("Bonus: $" + pekerja.getBonus());
        System.out.println("Total Pendapatan: $" + pekerja.getTotalPendapatan());
        System.out.println();
    }
}

