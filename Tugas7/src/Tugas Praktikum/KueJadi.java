package dpraktek7;

public class KueJadi extends Kue{
    private double jumlah;
    KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
    }
    public double lihatjumlah(){
        return jumlah;
    }
    @Override
    public double hitungharga() {
        return (lihatharga() * lihatjumlah())*2;
    }
}
