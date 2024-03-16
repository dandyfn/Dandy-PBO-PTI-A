

public class Student {
     private String name;
     private String address;
     private int age;
      double mathGrade;
      double englishGrade;
      double scienceGrade;
     private double average;
     int jumlahobjek;
     public Student(){
     name = "";
     address = "";
     age = 0;
     }
     public Student(double math, double english,double science){
       mathGrade = math; englishGrade = english; scienceGrade = science;
       jumlahobjek++;
     }
     public Student(String n, String a, int ag){
     name = n;
     address = a;
     age = ag;
     jumlahobjek++;
     }
     public void setName(String n){
     name = n;
     }
     public void setAddress(String a){
     address = a;
     }
     public void setAge(int ag){
     age = ag;
     }
     public void setMath(int math){
     mathGrade = math;
     }
     public void setEnglish(int english){
     englishGrade = english;
     }
     public void setScience(int science){
     scienceGrade = science;
     }
     private double getAverage(){
     double result = 0;
     result = (mathGrade+scienceGrade+englishGrade)/3;
     return result;
     }
     public void displayMessage(){
     System.out.println("Siswa dengan nama "+name);
     System.out.println("beramalat di "+address);
     System.out.println("berumur "+age);
     System.out.println("mempunyai nilai rata rata"+getAverage());
     System.out.println(statusAkhir());
     }
     public boolean statusAkhir(){
      boolean statusakhir = true;
      average=getAverage();
      if (average<=61) {
        statusakhir=true;
      } else {
        statusakhir=false;
      }
      return statusakhir;
     }
     public void jumlahObjek() {
      System.out.println("Jumlah objek yang dibuat: " + jumlahobjek);
  }

     }
    