

public class Mobil {
    private String noPlat;
     private String warna;
     private String manufaktur;
     private int kecepatan;
     double waktu;
    
     public void setNoPlat(String s){
     noPlat = s;
     }
     public void setWarna(String s){
     warna = s;
     }
     public void setManufaktur(String s){
     manufaktur = s;
     }
     public void setKecepatan(int i){
    rubahkecepatan(i);
     kecepatan = i;
     }
     public void displayMessage(){
     int jarak = hitungjarak()/1000;
     System.out.println("Mobil anda adalah bermerek"+manufaktur);
     System.out.println("mempunyai nomor plat "+noPlat);
     System.out.println("serta memililki warna "+warna);
     System.out.println("dan mampu menempuh kecepatan"+kecepatan);
     System.out.println("jarak "+jarak);
     
     }
     public void setwaktu(double waktu){
        this.waktu=waktu;
       rubahsekon(waktu);
     }  private double rubahsekon(double rubahsekon){
        return rubahsekon*60;
     } private double rubahkecepatan(int rubahkecepatan){
        double u = (int) rubahkecepatan/3.6;
        return u;
     }  int hitungjarak(){
        int jarak = (int) (kecepatan * waktu);
        return jarak;
     }
     }
    
