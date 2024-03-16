;

/**
 * hero
 */
public class hero {

    public static void main(String[] args) {
     
     heropintar dinda = new heropintar("dinda", 100);
     herokuat nidad = new herokuat("nidad");

     
     herobijak dandy = new herobijak("dandy ", 120, 6);
     herobijak alfarisi = new herobijak("alfarisi", 60);
     herobijak natanegara = new herobijak("nataegara");
     dandy.melakukanserangankeheropintar(dinda);
     dandy.tampilan();
     dandy.melakukanserangankeheropintar(dinda, 30);
     dandy.tampilan();
     dandy.melakukanserangankeheropintar(dinda, "++++++++++++++");
     dandy.tampilan();
     
    
    }
}