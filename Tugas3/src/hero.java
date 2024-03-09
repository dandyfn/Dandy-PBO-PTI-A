class herokuat {
    String nama;
    double nyawa;
    double serangan;
   private double kerusakan;
   private String namamusuh;
    herokuat(){ 
    }
    void melakukanserangankeherobijak(herobijak musuh){
        this.kerusakan=(musuh.nyawa*2) - (this.serangan*6);
        this.namamusuh=musuh.nama;
    }
    void melakukanserangankeheropintar(heropintar musuh){
        this.kerusakan=(musuh.nyawa) - (this.serangan*6);
        this.namamusuh=musuh.nama;
    }
    void tampilan(){
        System.out.println(this.nama +" melalukan serangan terhadap "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
}
/**
 * hero
 */
 class heropintar {
    String nama;
    double nyawa;
    double serangan;
    private double kerusakan;
    private String namamusuh;
     heropintar(){
    }void melakukanserangankeherobijak(herobijak musuh){
        this.kerusakan=(musuh.nyawa*2) - (this.serangan*5);
        this.namamusuh=musuh.nama;
    }
    void melakukanserangankeherokuat(herokuat musuh){
        this.kerusakan=(musuh.nyawa) - (this.serangan*5);
        this.namamusuh=musuh.nama;
    }
    void tampilan(){
        System.out.println(this.nama +" melalukan serangan terhadap "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
}
/**
 * hero
 */
class herobijak {
    String nama;
    double nyawa;
    double serangan;
    private double kerusakan;
    private String namamusuh;
    herobijak(){
    }
    public void melakukanserangankeheropintar(heropintar musuh){
        this.kerusakan=(musuh.nyawa*2) - this.serangan;
        this.namamusuh=musuh.nama;
    }
    public void melakukanserangankeherokuat(herokuat musuh){
        this.kerusakan=(musuh.nyawa) - this.serangan;
        this.namamusuh=musuh.nama;
    }
    public void tampilan(){
        System.out.println(this.nama +" melalukan serangan terhadap "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);}
        
}
/**
 * hero
 */
public class hero {

    public static void main(String[] args) {
        herokuat dandy = new herokuat();
        dandy.nama = "dandy";
        dandy.nyawa = 120;
        dandy.serangan = 12;
        herobijak dinda = new herobijak();
        dinda.nama = "dinda";
        dinda.nyawa = 100;
        dinda.serangan = 6;
        heropintar dedy = new heropintar();
        dedy.nama = "dedy";
        dedy.nyawa = 180;
        dedy.serangan = 10;
        dandy.melakukanserangankeherobijak(dinda);
        dandy.tampilan();
        dinda.melakukanserangankeheropintar(dedy);
        dinda.tampilan();
        dedy.melakukanserangankeherokuat(dandy);
        dedy.tampilan();
        
    }
}