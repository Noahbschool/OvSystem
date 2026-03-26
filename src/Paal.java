import java.util.Scanner;

public class Paal
{
    Scanner sc = new Scanner(System.in);

    private double instapTarief;
    private String typeVervoer;

    public void inchecken(Chipkaart chipkaart)
    {
        if (!chipkaart.getIngecheckt())
        {
            if (chipkaart.getSaldo() >= instapTarief)
            {
                if (chipkaart.getGeldig())
                {
                    chipkaart.setIngecheckt(true);
                    System.out.println("Success: U bent ingecheckt");
                }
                else
                {
                    System.out.println("Error: Kaart is niet geldig");
                }
            }
            else
            {
                System.out.println("Error: Saldo te laag");
            }
        }
        else
        {
            System.out.println("Error: U bent al ingecheckt");
        }
    }

    public void uitchecken(Chipkaart chipkaart)
    {
        if (chipkaart.getIngecheckt())
        {
            System.out.println("Success: Kaart is uitgecheckt");
            chipkaart.setSaldo(chipkaart.getSaldo() - instapTarief);
            chipkaart.setIngecheckt(false);
            toonSaldo(chipkaart);
        }
        else
        {
            System.out.println("Error: Kaart is niet ingecheckt");
        }
    }

    public void toonSaldo(Chipkaart chipkaart)
    {
        System.out.println(chipkaart.getSaldo());
    }

    public Paal(double instapTarief)
    {
        this.instapTarief = instapTarief;
    }
}
