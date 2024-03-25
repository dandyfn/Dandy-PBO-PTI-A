

public class lingkaran{
    int alas, tinggi;
    public lingkaran(String alas, String tinggi) {
       this.alas = parseToInt(alas);
       this.tinggi = parseToInt(tinggi);
   }
   private int parseToInt(String value) {
       try {
           return Integer.parseInt(value);
       } catch (NumberFormatException e) {
           System.out.println("Error parsing value to integer: " + value);
           return 0;
       }
   }

   public lingkaran(int alas){
    this.alas = alas;
    }
    public lingkaran(int alas, int tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
    }
    public void setAlas(int alas){
    this.alas = alas;
    }
    public void setTinggi(int tinggi){
    this.tinggi = tinggi;
    }
    public int getAlas(){
    return alas;
    }
    public int getTinggi(){
    return tinggi;
    }
    public double hitungLuas(){
    double hasil = (double)(getTinggi()*getAlas())/2;
    return hasil;
    }

    public void displayMessage(){
    System.out.println("Hitung Luas : "+hitungLuas());
    }
    }
   