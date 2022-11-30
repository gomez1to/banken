import java.util.ArrayList;
public class Konto extends Kund{
    String agare = namn;
    double saldo;
    int kontonummer;

    public Konto(){
    saldo = 0;
    }

    public void insattning(double summa){
        saldo = saldo + summa;
    }

    public void uttagning(double summa){
        saldo = saldo - summa;
    }

    public double getSaldo(){
        return saldo;
    }
}


