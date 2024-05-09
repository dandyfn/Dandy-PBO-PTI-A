package cek.dpraktek8;


abstract class Pegawai {
    protected String nama;
    protected String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    // Abstract method untuk menghitung gaji
    public abstract double hitungGaji();
}
