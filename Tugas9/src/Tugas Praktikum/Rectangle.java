package dpraktek9;

import java.util.Scanner;

public class Rectangle implements Colorable, Comparable{ // lass
//rectanggle
private String warna;
private int kategori;
 public Rectangle() {
 }
 public Rectangle(String warna) {
 this.warna = warna;
 }

 public void howToColor() {
 if(this.warna == null){
 System.out.println("tidak ada warna, warna bangun kotak masih polos");
 }
 else{
 System.out.println("bangun kotak sudah diwarnai dengan warna "+this.warna);
 }
 }
 public void compareTo(Object obj) {
 this.kategori = (int) obj;
 if(this.kategori == 0){
 System.out.println("ukuran cat yang cocok untuk bangunkotak dengan ukuran kategori " +this.kategori+" yaitu 2.5L" );
 }
 else{
 System.out.println("ukuran cat yang cocok untuk bangun kotak dengan ukuran kategori " +this.kategori+" yaitu 6.5L" );
 }
 }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int umur = input.nextInt();
    input.nextLine();
    String nama = input.nextLine();
Manusia manusia = new Manusia(nama, umur);
manusia.tampilkanNama();
manusia.tampilkanUmur();
Manusia manusia2 = new Manusia("dinda", 19);
manusia2.tampilkanNama(); manusia2.tampilkanUmur(); manusia2.berjalan();
 Rectangle kotak1 = new Rectangle("merah");
 Rectangle kotak2= new Rectangle();
 Rectangle kotak3 = new Rectangle();
 kotak1.howToColor();
 kotak2.howToColor();
 kotak3.compareTo(4);

}}
