

class herobijak {
    String nama;
    double nyawa;
    double serangan;
    private double kerusakan;
    private String namamusuh;
    herobijak(String nama){
        this.nama=nama;
    }
    herobijak(String nama, double nyawa){
        this.nama=nama; this.nyawa=nyawa;
    }
    herobijak(String nama, double nyawa, double serangan){
        this.nama=nama; this.nyawa=nyawa; this.serangan=serangan;
    }
    public void melakukanserangankeheropintar(heropintar musuh){
        this.kerusakan=(musuh.nyawa*2) - this.serangan;
        this.namamusuh=musuh.nama;
    }
    public void melakukanserangankeheropintar(heropintar musuh, double seranganbaru){
        this.serangan=seranganbaru;
        this.kerusakan=(musuh.nyawa*2) - serangan;
        this.namamusuh=musuh.nama;
    }
    public void melakukanserangankeheropintar(heropintar musuh, String bugnama){
        this.kerusakan=(musuh.nyawa*2) - this.serangan;
        this.namamusuh=bugnama;
        System.out.println("karakter musuh mengalami bug");
    }
    public void melakukanserangankeherokuat(herokuat musuh){
        this.kerusakan=(musuh.nyawa) - this.serangan;
        this.namamusuh=musuh.nama;
    }
    public void tampilan(){
        System.out.println(this.nama +" melalukan serangan terhadap "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
    public herobijak kembalikanherobijak(){
        herobijak herobijak = new herobijak(nama, nyawa, serangan);
        return herobijak;
    }
        
}