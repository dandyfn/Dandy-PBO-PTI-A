
import java.util.Scanner;

public class MainStudent {
     public static void main(String[] args) {
          Scanner iScanner = new Scanner(System.in);
          int jumlahsiswa = iScanner.nextInt();
          String siswa [] = new String[10];
     
          for (int i = 0; i < jumlahsiswa+1; i++) {
               siswa[i]=iScanner.nextLine();
          }

     Student anna = new Student(null, null, 0);
     anna.setName("Anna");
     anna.setAddress("Malang");
     anna.setAge(20);
     anna.setMath(100);
     anna.setScience(89);
     anna.setEnglish(80);
     anna.displayMessage();
    
     //menggunakan constructor lain
     System.out.println("===================");
     Student chris = new Student("Chris", "Kediri", 21);
     chris.setMath(70);
     chris.setScience(60);
     chris.setEnglish(90);
     chris.displayMessage();
    
    
    
     //siswa dengan nama anna dirubah informasi alamat dan
    
     System.out.println("===================");
     anna = new Student("anna", "Batu", 18);
     anna.displayMessage();
    
     //siswa denagan nama chris dirubah informasi alamat dan
     
     System.out.println("===================");
     chris.setAddress("Surabaya");
     chris.setAge(22);
     chris.displayMessage();

    Student dandy = new Student(70, 80, 90);
     }
    }
    
