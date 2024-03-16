

class heropintar {
    String nama;
    double nyawa;
    double serangan;
    private double kerusakan;
    private String namamusuh;
    heropintar(String nama, double nyawa){
        this.nama=nama; this.nyawa=nyawa; 
    }
    public void melakukanserangankeherobijak(herobijak musuh){
        this.kerusakan=(musuh.nyawa*2) - (this.serangan*5);
        this.namamusuh=musuh.nama;
    }
    public void melakukanserangankeherokuat(herokuat musuh){
        this.kerusakan=(musuh.nyawa) - (this.serangan*5);
        this.namamusuh=musuh.nama;
    }
   public void tampilan(){
        System.out.println(this.nama +" melalukan serangan terhadap "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
}