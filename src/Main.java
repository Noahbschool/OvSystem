import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        String mainMenuInvoer;

        Scanner sc = new Scanner(System.in);

        Chipkaart k1 = new Chipkaart();
        Paal busPaal = new Paal(1);
        Paal treinPaal = new Paal(5);
        Automaat automaat = new Automaat();
        boolean mainMenuActief = true;
        while (mainMenuActief)
        {
            System.out.println("-------Menu-------");
            System.out.println("1. Incheck/Uitcheck menu");
            System.out.println("2. Saldo menu");
            System.out.println("3. Kaart info menu");
            System.out.println("4. Quit");

            System.out.print("Uw menu keuze: ");
            mainMenuInvoer = sc.nextLine();

            switch (mainMenuInvoer)
            {
                case "1":
                    boolean incheckMenuActief = true;
                    while (incheckMenuActief)
                    {
                        System.out.println("-------Menu-------");
                        System.out.println("1. Inchecken bus");
                        System.out.println("2. Uitchecken bus");
                        System.out.println("3. Inchecken trein");
                        System.out.println("4. Uitchecken trein");
                        System.out.println("5. Terug");

                        System.out.print("Uw menu keuze: ");
                        mainMenuInvoer = sc.nextLine();

                        switch (mainMenuInvoer)
                        {
                            case "1":
                                busPaal.inchecken(k1);
                                break;
                            case "2":
                                busPaal.uitchecken(k1);
                                break;
                            case "3":
                                treinPaal.inchecken(k1);
                                break;
                            case "4":
                                treinPaal.uitchecken(k1);
                                break;
                            case "5":
                                incheckMenuActief = false;
                                break;

                        }
                    }
                    break;
                case "2":
                    System.out.println("-------Menu-------");
                    System.out.println("1. Saldo toevoegen");
                    System.out.println("2. Saldo tonen");
                    System.out.println("3. Terug");

                    System.out.print("Uw menu keuze: ");
                    mainMenuInvoer = sc.nextLine();
                    try
                    {

                        switch (mainMenuInvoer)
                        {
                            case "1":
                                automaat.saldoOpwaarderen(k1);
                                break;
                            case "2":
                                automaat.toonSaldo(k1);
                                break;
                            case "3":
                                break;
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please put in a number");
                    }
                    break;
                case "3":
                    System.out.println("-------Menu-------");
                    System.out.println("1. Toon of je bent ingecheckt");
                    System.out.println("2. Toon of je kaart geldig is");
                    System.out.println("3. Toon je kaartnummer");
                    System.out.println("4. Terug");

                    System.out.print("Uw menu keuze: ");
                    mainMenuInvoer = sc.nextLine();

                    switch (mainMenuInvoer)
                    {
                        case "1":
                            System.out.println("Ingecheckt: " + k1.getIngecheckt());
                            break;
                        case "2":
                            System.out.println("Geldig: " + k1.getGeldig());
                            break;
                        case "3":
                            System.out.println("Kaartnummer: " + k1.getKaartnummer());
                            break;
                        case "4":
                    }
                    break;
                case "4":
                    System.exit(0);
            }
        }
    }
}