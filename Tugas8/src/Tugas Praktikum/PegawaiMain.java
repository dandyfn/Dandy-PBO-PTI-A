package cek.dpraktek8;
/**
 * PegawaiMain
 */
public class PegawaiMain {

    public static void main(String[] args) {
        Pegawai pegawai1 = new PegawaiTetap("Andi", "123456789", 5000000);
        Pegawai pegawai2 = new PegawaiHarian("Budi", "987654321", 20000, 45);
        Pegawai pegawai3 = new Sales("Cici", "456789123", 10000000, 0.1);
        
        // Memanggil method hitungGaji() pada setiap objek pegawai
        System.out.println("Gaji " + pegawai1.nama + ": Rp " + pegawai1.hitungGaji());
        System.out.println("Gaji " + pegawai2.nama + ": Rp " + pegawai2.hitungGaji());
        System.out.println("Gaji " + pegawai3.nama + ": Rp " + pegawai3.hitungGaji());
    }
    }
