import java.util.Scanner;

public class Chipkaart
{
    Scanner sc = new Scanner(System.in);

    private static int kaartTeller = 1;
    private double saldo;
    private int kaartnummer;
    private boolean ingecheckt;
    private boolean geldig;

    public Chipkaart()
    {
        this.kaartnummer = kaartTeller++;
        this.geldig = true;
    }

    public boolean getIngecheckt()
    {
        return ingecheckt;
    }

    public void setIngecheckt(boolean ingecheckt)
    {
        this.ingecheckt = ingecheckt;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public int getKaartnummer()
    {
        return kaartnummer;
    }

    public boolean getGeldig()
    {
        return geldig;
    }
}

