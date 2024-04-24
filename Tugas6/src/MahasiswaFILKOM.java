package dpraktek6;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // Setter dan Getter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    // Method untuk mendapatkan status berdasarkan nim
    public String getStatus() {
        String prodi = "";
        String angkatan = nim.substring(0, 2);
        String prodiCode = nim.substring(6, 7);
        switch (prodiCode) {
            case "2":
                prodi = "Teknik Informatika";
                break;
            case "3":
                prodi = "Teknik Komputer";
                break;
            case "4":
                prodi = "Sistem Informasi";
                break;
            case "6":
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Unknown";
        }
        return prodi + ", 20" + angkatan;
    }

    // Method untuk mendapatkan jumlah beasiswa berdasarkan IPK
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }

    // Method untuk menampilkan informasi mahasiswa
    @Override
    public String toString() {
        return super.toString() + ", NIM: " + nim + ", IPK: " + ipk + ", Status: " + getStatus();
    }

    // Main method untuk menguji kelas MahasiswaFILKOM
    public static void main(String[] args) {
        MahasiswaFILKOM mahasiswa = new MahasiswaFILKOM("Dandy", true, "123456789", false, "235150600000000", 3.8);
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Dipta", true, "085707591", false, "174320255456319", 3);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Dira", false, "165435755", false, "203335467334595", 2.5);
        System.out.println("Informasi Mahasiswa:");
        System.out.println(mahasiswa);
        System.out.println("Beasiswa: $" + mahasiswa.getBeasiswa());
        System.out.println();
        System.out.println(mahasiswa1);
        System.out.println("Beasiswa: $" + mahasiswa1.getBeasiswa());
        System.out.println();
        System.out.println(mahasiswa2);
        System.out.println("Beasiswa: $" + mahasiswa2.getBeasiswa());
        System.out.println();
    }
}

