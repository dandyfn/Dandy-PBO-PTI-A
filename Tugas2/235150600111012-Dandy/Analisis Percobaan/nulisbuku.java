class hitungnulisbuku {
    int berapakalinulisnya;
    hitungnulisbuku(double inputberpakali){
        int hasilhitung = (int) (100/inputberpakali);
        this.berapakalinulisnya=hasilhitung;
    } void tampilan(){
        System.out.println(this.berapakalinulisnya);
    } 
        
    }
    public class nulisbuku {
        public static void main(String[] args) {
            hitungnulisbuku buku1 = new hitungnulisbuku(0.5);
            buku1.tampilan();}}
