package dpraktek6;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true : laki-laki, false : perempuan
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // Setter dan Getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean isMenikah() {
        return menikah;
    }

    // Method untuk menghitung tunjangan
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) { // laki-laki
                return 25.0;
            } else { // perempuan
                return 20.0;
            }
        } else {
            return 15.0;
        }
    }

    // Method untuk menghitung pendapatan
    public double getPendapatan() {
        return getTunjangan();
    }

    // Method untuk menampilkan informasi manusia
    @Override
    public String toString() {
        String gender = jenisKelamin ? "Laki-laki" : "Perempuan";
        return "Nama: " + nama + ", NIK: " + nik + ", Jenis Kelamin: " + gender + ", Pendapatan: $" + getPendapatan();
    }

    // Main method untuk menguji kelas Manusia
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Dandy", true, "123456789", true);
        Manusia manusia2 = new Manusia("Dinda", false, "987654321", false);
        Manusia manusia3 = new Manusia("Dira", false, "829282027", true);

        System.out.println("Informasi Manusia 1:");
        System.out.println(manusia1);
        System.out.println();

        System.out.println("Informasi Manusia 2:");
        System.out.println(manusia2);
        System.out.println();

        System.out.println("Informasi Manusia 3:");
        System.out.println(manusia3);
    }
}

