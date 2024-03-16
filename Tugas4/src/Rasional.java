

public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    // mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut != 0);
    }

    // menyederhanakan bilangan rasional
    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;

        for (; B != 0;) {
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /= A;
        penyebut /= A;
    }

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;

    }

    // operator >
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    // operator Unary- ---> A = -A
    public void negasi() {
        pembilang = -pembilang;
    }

    // operator unary += \
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    // operator <
    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    // operator <=
    public boolean lessThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    // operator >=
    public boolean greaterThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    // operator !=
    public boolean notEqual(Rasional A) {
        return (pembilang * A.penyebut != penyebut * A.pembilang);
    }

    // operator binary -
    public Rasional subtract(Rasional A) {
        int resultPembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        int resultPenyebut = penyebut * A.penyebut;
        Rasional result = new Rasional(resultPembilang, resultPenyebut);
        result.Sederhana(); // Menggunakan method sederhana untuk menyederhanakan hasil
        return result;
    }

    // operator binary *
    public Rasional multiply(Rasional A) {
        int resultPembilang = pembilang * A.pembilang;
        int resultPenyebut = penyebut * A.penyebut;
        Rasional result = new Rasional(resultPembilang, resultPenyebut);
        result.Sederhana(); // Menggunakan method sederhana untuk menyederhanakan hasil
        return result;
    }

    // operator binary /
    public Rasional divide(Rasional A) {
        int resultPembilang = pembilang * A.penyebut;
        int resultPenyebut = penyebut * A.pembilang;
        Rasional result = new Rasional(resultPembilang, resultPenyebut);
        result.Sederhana(); // Menggunakan method sederhana untuk menyederhanakan hasil
        return result;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
