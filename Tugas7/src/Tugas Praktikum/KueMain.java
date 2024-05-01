package dpraktek7;

public class KueMain {
    public static void main(String[] args) {
        Kue [] daftarKue = new Kue[20];
        KueJadi kuejadi1 = new KueJadi("a", 30, 3);
        KueJadi kuejadi2 = new KueJadi("b", 50, 34);
        KueJadi kuejadi3 = new KueJadi("", 30, 7);
        KueJadi kuejadi4 = new KueJadi("d", 80, 0);
        KueJadi kuejadi5 = new KueJadi("f", 40, 0);
        KueJadi kuejadi6 = new KueJadi("g", 50, 0);
        KueJadi kuejadi7 = new KueJadi("h", 60, 0);
        KueJadi kuejadi8 = new KueJadi("i", 20, 0);
        KueJadi kuejadi9 = new KueJadi("j", 10, 0);
        KueJadi kuejadi10 = new KueJadi("k", 100, 0);
        KuePesanan kuePesanan1 = new KuePesanan("l", 120, 0);
        KuePesanan kuePesanan2 = new KuePesanan("m", 90, 0);
        KuePesanan kuePesanan3 = new KuePesanan("m", 140, 0);
        KuePesanan kuePesanan4 = new KuePesanan("n", 200, 0);
        KuePesanan kuePesanan5 = new KuePesanan("o", 110, 0);
        KuePesanan kuePesanan6 = new KuePesanan("p", 70, 0);
        KuePesanan kuePesanan7 = new KuePesanan("q", 60, 0);
        KuePesanan kuePesanan8 = new KuePesanan("r", 40, 0);
        KuePesanan kuePesanan9 = new KuePesanan("s", 130, 0);
        KuePesanan kuePesanan10 = new KuePesanan("t", 160, 0);
        daftarKue[0]=kuejadi1;
        daftarKue[1]=kuejadi2;
        daftarKue[2]=kuejadi3;
        daftarKue[3]=kuejadi4;
        daftarKue[4]=kuejadi5;
        daftarKue[5]=kuejadi6;
        daftarKue[6]=kuejadi7;
        daftarKue[7]=kuejadi8;
        daftarKue[8]=kuejadi9;
        daftarKue[9]=kuejadi10;
        daftarKue[10]=kuePesanan1;
        daftarKue[11]=kuePesanan2;
        daftarKue[12]=kuePesanan3;
        daftarKue[13]=kuePesanan4;
        daftarKue[14]=kuePesanan5;
        daftarKue[15]=kuePesanan6;
        daftarKue[16]=kuePesanan7;
        daftarKue[17]=kuePesanan8;
        daftarKue[18]=kuePesanan9;
        daftarKue[19]=kuePesanan10;

        for (int i = 0; i < daftarKue.length; i++) {
            System.out.println(daftarKue[i]);
            if (daftarKue[i] instanceof KuePesanan) {
                System.out.println("Jenis Kue: Kue Pesanan");
            } else if (daftarKue[i] instanceof KueJadi) {
                System.out.println("Jenis Kue: Kue Jadi");
            }
            System.out.println();
        }
        double totalharga=0;
        for(Kue kue : daftarKue){
            totalharga=totalharga+kue.lihatharga();
        }
        System.out.println("Total semua harga kue : "+totalharga);
        double totalhargakuejadi=0;
        double totaljumlahkuejadi=0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalhargakuejadi=totalhargakuejadi+kue.lihatharga();
                totaljumlahkuejadi=totaljumlahkuejadi+((KueJadi)kue).lihatjumlah();
            }
        }
        System.out.println("Total harga semua kue jadi : "+totalhargakuejadi);
        System.out.println("Total jumlah semua kue jadi : "+totaljumlahkuejadi);
     
        double totalhargakuepesanan=0;
        double totalberatkuepesanan=0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalhargakuepesanan=totalhargakuepesanan+kue.lihatharga();
                totalberatkuepesanan=totalberatkuepesanan+((KuePesanan)kue).lihatberat();
            }
        }
        System.out.println("Total harga semua kue pesanan : "+totalhargakuepesanan);
        System.out.println("Total berat semua kue pesanan : "+totalberatkuepesanan);
        
        Kue kueTerbesar = daftarKue[5];
        for (int i = 1; i < daftarKue.length; i++) {
            if (daftarKue[i].hitungharga() > kueTerbesar.hitungharga()) {
                kueTerbesar = daftarKue[i];
            }
        }
        System.out.println("Informasi Kue dengan Harga Terbesar:");
        System.out.println(kueTerbesar);
    }
}
