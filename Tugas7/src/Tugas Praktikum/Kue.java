package dpraktek7;

public abstract class  Kue {
    private String nama;
    private double harga;
    Kue (String nama, double harga){
        this.nama=nama; this.harga=harga;
    }
    public String lihatnama(){
        return nama;
    }
    public double lihatharga(){
        return harga;
    }
    abstract double hitungharga();
    public String toString (){
        return "Nama Kue: " + nama + "\nHarga: Rp " + String.format("%.2f", harga);
    }

}
