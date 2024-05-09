package cek.dpraktek8;

class Sales extends Pegawai {
    private double totalPenjualan;
    private double komisi;

    public Sales(String nama, String noKTP, double totalPenjualan, double komisi) {
        super(nama, noKTP);
        this.totalPenjualan = totalPenjualan;
        this.komisi = komisi;
    }

    @Override
    public double hitungGaji() {
        return totalPenjualan * komisi;
    }
}