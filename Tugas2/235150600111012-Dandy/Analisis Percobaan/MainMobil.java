
import java.util.Scanner;

public class MainMobil {
    
    public static void main(String[] args) {
    //instan objek bernama m1
    Scanner input = new Scanner(System.in);
    String manufatur = input.next();
    String plat = input.next();
    String warna = input.next();
    Mobil m1 = new Mobil();
     m1.setKecepatan(50);
     m1.setManufaktur(manufatur);
     m1.setNoPlat(plat);
     m1.setWarna(warna);
     m1.displayMessage();
     System.out.println("================");
     //instan objek baru bernama m2
     Mobil m2 = new Mobil();
     m2.setKecepatan(100);
     m2.setManufaktur("Mitsubishi");
     m2.setNoPlat("N 1134 AG");
     m2.setWarna("Pink");
     m2.displayMessage();
     System.out.println("================");
     //merubah warna dari objek m1
     System.out.println("mobil pada objek m1 di rubah menjadi warnahijau");
     m1.setWarna("Hijau");
     //menampilkan hasil perubahan
     m1.displayMessage(); 
     input.close();
     }
     }
    
