

class herokuat {
    String nama;
    double nyawa;
    double serangan;
   private double kerusakan;
   private String namamusuh;
    herokuat(String nama){
        this.nama=nama;
    }
    public void melakukanserangankeherobijak(herobijak musuh){
        this.kerusakan=(musuh.nyawa*2) - (this.serangan*6);
        this.namamusuh=musuh.nama;
    }
    public void melakukanserangankeheropintar(heropintar musuh){
        this.kerusakan=(musuh.nyawa) - (this.serangan*6);
        this.namamusuh=musuh.nama;
    }
    public void tampilan(){
        System.out.println(this.nama +" melalukan serangan terhadap "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
}