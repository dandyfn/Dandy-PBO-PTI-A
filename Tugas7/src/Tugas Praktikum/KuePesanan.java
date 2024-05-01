package dpraktek7;

public class KuePesanan extends Kue {
    private double berat;
    KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
    }
    double lihatberat(){
        return berat;
    }
    @Override
    public double hitungharga() {
        return lihatharga() * lihatberat();
    }

}
