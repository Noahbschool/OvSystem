public class Paal
{
    private double instapTarief = 10;


    public void inchecken(Kaart Kaart)
    {
        if (Kaart.getGeldig() == false)
        {
            System.out.println("Error: Uw kaart is niet geldig");
            return;
        }
        if (Kaart.getIsIngecheckt() == true){
            System.out.println("Error: Uw kaart is al ingechecked");
            return;
        }
    }



    public double getInstapTarief()
    {
        return instapTarief;
    }
}
