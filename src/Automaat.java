import java.util.Scanner;

public class Automaat
{


    public void saldoOpwaarderen(Chipkaart chipkaart)
    {
        Scanner sc = new Scanner(System.in);

        int opwaardeerAantal = 0;

        System.out.println("Hoeveel wilt u opwaarderen?");
        System.out.print("Hoeveelheid: ");
        opwaardeerAantal = sc.nextInt();
        if (opwaardeerAantal > 0)
        {
            chipkaart.setSaldo(chipkaart.getSaldo() + opwaardeerAantal);
        }
    }

    public void toonSaldo(Chipkaart chipkaart)
    {
        System.out.println("Uw saldo is: " + chipkaart.getSaldo());
    }
}
